package designpatterns.structural;

import designpatterns.structural.decorator.*;
import designpatterns.structural.facade.FachadaRequest;
import designpatterns.structural.facade.FachadaServiceImpl;
import designpatterns.structural.proxy.CuentaBancaria;
import designpatterns.structural.proxy.CuentaServiceProxy;
import lombok.extern.java.Log;

import java.io.IOException;
import java.math.BigDecimal;

@Log
public class AppStructural {

    public static void main(String[] args) throws IOException {

        // Facade pattern -------------------------------
        FachadaServiceImpl fachadaServiceImpl = new FachadaServiceImpl();
        String result = fachadaServiceImpl.buscar(new FachadaRequest("25/12/2019", "28/12/2018", "Guadalajara", "Vallarta"));
        log.info(result);

        // Decorator pattern -------------------------------
        Cuenta cuenta = new Cuenta(1L, "Froy");
        CuentaService cuentaService1 = new CuentaAhorroServiceImpl();
        cuentaService1.abrirCuenta(cuenta);

        CuentaService cuentaService2 = new CuentaCorrienteServiceImpl();
        cuentaService2.abrirCuenta(cuenta);

        CuentaService cuentaService3 = new BlindajeDecorador(new CuentaCorrienteServiceImpl());
        cuentaService3.abrirCuenta(cuenta);

        // Proxy pattern -------------------------------
        CuentaBancaria cuentaBancaria = new CuentaBancaria(25L, "Froy", BigDecimal.TEN);
        designpatterns.structural.proxy.CuentaService cuentaService = new CuentaServiceProxy();
        cuentaService.mostrar(cuentaBancaria);
        cuentaService.depositar(cuentaBancaria, new BigDecimal("30"));
        cuentaService.mostrar(cuentaBancaria);
        cuentaService.retirar(cuentaBancaria, new BigDecimal("35"));
        cuentaService.mostrar(cuentaBancaria);

    }

}
