package designpatterns.behavioral;

import designpatterns.behavioral.command.*;
import designpatterns.behavioral.memento.Caretaker;
import designpatterns.behavioral.memento.Juego;
import designpatterns.behavioral.memento.Originator;
import designpatterns.behavioral.observer.GBPObservador;
import designpatterns.behavioral.observer.MXNObservador;
import designpatterns.behavioral.observer.Subject;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * @author Froy
 */
public class AppBehaviral {

    public static void main(String[] args) throws IOException {

        // Command Pattern ----------------------------------
        SaldoFamiliar saldoFamiliar = new SaldoFamiliar(new BigDecimal("10")); // Inicial

        SaldoFamiliarService saldoIngreso = new SaldoIngresoServiceImpl(saldoFamiliar, new BigDecimal("100"));
        SaldoFamiliarService saldoGasto = new SaldoGastoServiceImpl(saldoFamiliar, new BigDecimal("5"));

        Invoker invoker = new Invoker();
        invoker.recibirMovimientos(saldoIngreso);
        invoker.recibirMovimientos(saldoGasto);

        invoker.realizarOperaciones();

        System.out.println(saldoFamiliar.getSaldo());

        // Memento Pattern ----------------------------------
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        String nombreJuego = "Juemento";

        Juego juego = new Juego(nombreJuego, 1);
        juego = new Juego(nombreJuego, 2);
        originator.setEstado(juego);

        juego = new Juego(nombreJuego, 3);
        originator.setEstado(juego);

        caretaker.addMemento(originator.guardar()); // Estado posicion 0

        juego = new Juego(nombreJuego, 4);
        originator.setEstado(juego);

        caretaker.addMemento(originator.guardar()); // Estado posicion 1

        juego = new Juego(nombreJuego, 5);
        originator.setEstado(juego);

        originator.restaurar(caretaker.getMemento(1));

        juego = originator.getEstado();
        System.out.println(juego);

        // Observer pattern
        Subject sujeto = new Subject();

        new MXNObservador(sujeto);
        new GBPObservador(sujeto);

        System.out.println("Si se desea cambiar 10 USD ");
        sujeto.setEstado(10);
        System.out.println("-------------------------------------");
        System.out.println("Si se desea cambiar 100 USD ");
        sujeto.setEstado(100);

    }

}
