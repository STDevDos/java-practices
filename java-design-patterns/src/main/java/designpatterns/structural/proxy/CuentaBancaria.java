package designpatterns.structural.proxy;

import java.math.BigDecimal;

public class CuentaBancaria {
    private Long idCuenta;
    private String nombre;
    private BigDecimal saldo;

    @java.lang.SuppressWarnings("all")
    public Long getIdCuenta() {
        return this.idCuenta;
    }

    @java.lang.SuppressWarnings("all")
    public String getNombre() {
        return this.nombre;
    }

    @java.lang.SuppressWarnings("all")
    public BigDecimal getSaldo() {
        return this.saldo;
    }

    @java.lang.SuppressWarnings("all")
    public void setIdCuenta(final Long idCuenta) {
        this.idCuenta = idCuenta;
    }

    @java.lang.SuppressWarnings("all")
    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    @java.lang.SuppressWarnings("all")
    public void setSaldo(final BigDecimal saldo) {
        this.saldo = saldo;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof CuentaBancaria)) return false;
        final CuentaBancaria other = (CuentaBancaria) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$idCuenta = this.getIdCuenta();
        final java.lang.Object other$idCuenta = other.getIdCuenta();
        if (this$idCuenta == null ? other$idCuenta != null : !this$idCuenta.equals(other$idCuenta)) return false;
        final java.lang.Object this$nombre = this.getNombre();
        final java.lang.Object other$nombre = other.getNombre();
        if (this$nombre == null ? other$nombre != null : !this$nombre.equals(other$nombre)) return false;
        final java.lang.Object this$saldo = this.getSaldo();
        final java.lang.Object other$saldo = other.getSaldo();
        if (this$saldo == null ? other$saldo != null : !this$saldo.equals(other$saldo)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof CuentaBancaria;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $idCuenta = this.getIdCuenta();
        result = result * PRIME + ($idCuenta == null ? 43 : $idCuenta.hashCode());
        final java.lang.Object $nombre = this.getNombre();
        result = result * PRIME + ($nombre == null ? 43 : $nombre.hashCode());
        final java.lang.Object $saldo = this.getSaldo();
        result = result * PRIME + ($saldo == null ? 43 : $saldo.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "CuentaBancaria(idCuenta=" + this.getIdCuenta() + ", nombre=" + this.getNombre() + ", saldo=" + this.getSaldo() + ")";
    }

    @java.lang.SuppressWarnings("all")
    public CuentaBancaria(final Long idCuenta, final String nombre, final BigDecimal saldo) {
        this.idCuenta = idCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }
}
