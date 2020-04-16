package designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public class VendedorNivel2 implements StrategyVendedor {

    @Override
    public BigDecimal profitFromSale(int cantidadDeProductoVendido) {
        return new BigDecimal(cantidadDeProductoVendido * 1.57);
    }

}
