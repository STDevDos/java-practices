package designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public interface StrategyVendedor {

    BigDecimal profitFromSale(int cantidadDeProductoVendido);

}
