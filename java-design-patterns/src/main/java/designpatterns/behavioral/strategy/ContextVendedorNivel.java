package designpatterns.behavioral.strategy;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class ContextVendedorNivel {

    private StrategyVendedor strategyVendedor;

    public BigDecimal profitFromSale(int cantidadDeProductoVendido){
        return strategyVendedor.profitFromSale(cantidadDeProductoVendido);
    }

}
