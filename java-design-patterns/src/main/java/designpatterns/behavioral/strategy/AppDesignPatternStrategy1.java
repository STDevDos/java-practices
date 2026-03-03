package designpatterns.behavioral.strategy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AppDesignPatternStrategy1 {
    public static void main(String[] args) throws Exception {
        ContextVendedorNivel contextVendedorNivel = new ContextVendedorNivel(new VendedorNivel1());
        System.out.println(contextVendedorNivel.profitFromSale(50));

        String tipoDeVendedorFromDatabase = "VENDEDOR_NIVEL_1";
        String tipoDeVendedorParsed = parseTipoDeVendedorLikeNameClass(tipoDeVendedorFromDatabase);

        final Class<?> clazz = Class.forName("designpatterns.behavioral.strategy." + tipoDeVendedorParsed);
        Object vendedorNivelTest = clazz.getDeclaredConstructor().newInstance();
        Object profitFromSaleInvoke = clazz.getMethod("profitFromSale", int.class).invoke(vendedorNivelTest, 50);

        System.out.println(profitFromSaleInvoke);

        ContextVendedorNivel contextVendedorNivelTest2 = new ContextVendedorNivel((StrategyVendedor) vendedorNivelTest);
        System.out.println(contextVendedorNivelTest2.profitFromSale(50));
    }

    private static String parseTipoDeVendedorLikeNameClass(String tipoVendedor) {
        if (tipoVendedor == null) {
            throw new java.lang.NullPointerException("tipoVendedor is marked non-null but is null");
        }
        // VENDEDOR_NIVEL_1 -> VendedorNivel1
        return Arrays.stream(tipoVendedor.toLowerCase().split("_"))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining());
    }
}
