package designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public class VendedorNivel {

    private StrategyVendedor strategyVendedor;

    public VendedorNivel(StrategyVendedor strategyVendedor){
        this.strategyVendedor = strategyVendedor;
    }

    public BigDecimal profitFromSale(int cantidadDeProductoVendido){
        return strategyVendedor.profitFromSale(cantidadDeProductoVendido);
    }

}
