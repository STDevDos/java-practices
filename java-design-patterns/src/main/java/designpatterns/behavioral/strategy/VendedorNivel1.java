package designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public class VendedorNivel1 implements StrategyVendedor {

    @Override
    public BigDecimal profitFromSale(int cantidadDeProductoVendido) {
        return new BigDecimal(cantidadDeProductoVendido * 2.52);
    }

}
