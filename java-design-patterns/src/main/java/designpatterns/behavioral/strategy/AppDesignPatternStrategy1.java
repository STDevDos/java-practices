package designpatterns.behavioral.strategy;

import lombok.NonNull;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.commons.text.WordUtils;


public class AppDesignPatternStrategy1 {

    public static void main(String[] args) throws Exception {

        ContextVendedorNivel contextVendedorNivel = new ContextVendedorNivel(new VendedorNivel1());
        System.out.println(contextVendedorNivel.profitFromSale(50));

        String tipoDeVendedorFromDatabase = "VENDEDOR_NIVEL_1";
        String tipoDeVendedorParsed = parseTipoDeVendedorLikeNameClass(tipoDeVendedorFromDatabase);
        final Class<?> clazz = ClassUtils.getClass("designpatterns.behavioral.strategy." + tipoDeVendedorParsed);
//        Object profitFromSale = MethodUtils.invokeStaticMethod(clazz, "profitFromSale", 50);

        Object vendedorNivelTest = clazz.getDeclaredConstructor().newInstance();
        Object profitFromSaleInvoke = MethodUtils.invokeMethod(vendedorNivelTest, "profitFromSale", 50);
        System.out.println(profitFromSaleInvoke);

        //like ...this way
        ContextVendedorNivel contextVendedorNivelTest2 = new ContextVendedorNivel((StrategyVendedor) vendedorNivelTest);
        System.out.println(contextVendedorNivelTest2.profitFromSale(50));

    }

    private static String parseTipoDeVendedorLikeNameClass(@NonNull String tipoVendedor) {
        return StringUtils.replaceEach( //
                WordUtils.capitalizeFully(tipoVendedor, new char[]{'_'}), //
                new String[]{"_"}, new String[]{StringUtils.EMPTY});
    }

}
