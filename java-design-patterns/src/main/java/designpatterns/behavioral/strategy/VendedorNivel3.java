package designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public class VendedorNivel3 implements StrategyVendedor {

    @Override
    public BigDecimal profitFromSale(int cantidadDeProductoVendido) {
        return new BigDecimal(cantidadDeProductoVendido * 0.99);
    }

}
