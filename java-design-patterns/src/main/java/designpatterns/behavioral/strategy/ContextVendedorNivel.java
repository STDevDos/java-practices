package designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public class ContextVendedorNivel {
    private StrategyVendedor strategyVendedor;

    public BigDecimal profitFromSale(int cantidadDeProductoVendido) {
        return strategyVendedor.profitFromSale(cantidadDeProductoVendido);
    }

    @java.lang.SuppressWarnings("all")
    public ContextVendedorNivel(final StrategyVendedor strategyVendedor) {
        this.strategyVendedor = strategyVendedor;
    }
}
