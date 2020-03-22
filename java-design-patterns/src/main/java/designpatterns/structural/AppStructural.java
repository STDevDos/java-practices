package designpatterns.structural;

import designpatterns.structural.decorator.*;
import designpatterns.structural.facade.Fachada;
import designpatterns.structural.facade.FachadaRequest;
import designpatterns.structural.proxy.CuentaBancaria;
import designpatterns.structural.proxy.CuentaService;
import designpatterns.structural.proxy.CuentaServiceProxy;

import java.io.IOException;
import java.math.BigDecimal;

public class AppStructural {

    public static void main(String[] args) throws IOException {

        // Facade pattern -------------------------------
        Fachada fachada = new Fachada();
        String result = fachada.buscar(new FachadaRequest("25/12/2019", "28/12/2018", "Guadalajara", "Vallarta"));
        System.out.println(result);

        // Decorator pattern -------------------------------
        Cuenta cuenta = new Cuenta(1L, "Froy");
        ICuenta icuenta = new CuentaAhorroImpl();
        icuenta.abrirCuenta(cuenta);

        ICuenta icuenta2 = new CuentaCorrienteImpl();
        icuenta2.abrirCuenta(cuenta);

        ICuenta icuenta3 = new BlindajeDecorador(new CuentaCorrienteImpl());
        icuenta3.abrirCuenta(cuenta);

        // Proxy pattern -------------------------------
        CuentaBancaria cuentaBancaria = new CuentaBancaria(25L, "Froy", BigDecimal.TEN);
        CuentaService cuentaService = new CuentaServiceProxy();
        cuentaService.mostrar(cuentaBancaria);
        cuentaService.depositar(cuentaBancaria, new BigDecimal("30"));
        cuentaService.mostrar(cuentaBancaria);
        cuentaService.retirar(cuentaBancaria, new BigDecimal("35"));
        cuentaService.mostrar(cuentaBancaria);

    }

}
