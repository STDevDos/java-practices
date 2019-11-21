package proxy;

import java.math.BigDecimal;

/**
 * @author Froy
 */
public class CuentaBancaria {

    private Long idCuenta;
    private String nombre;
    private BigDecimal saldo;

    private CuentaBancaria() {
        throw new IllegalArgumentException("NOT VALID");
    }

    public CuentaBancaria(Long idCuenta, String nombre, BigDecimal saldo) {
        this.idCuenta = idCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Long getIdCuenta() {
        return idCuenta;
    }

    public String getNombre() {
        return nombre;
    }

}
