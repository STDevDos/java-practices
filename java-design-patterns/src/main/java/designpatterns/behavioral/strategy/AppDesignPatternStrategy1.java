package designpatterns.behavioral.strategy;

import lombok.NonNull;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.commons.text.WordUtils;


public class AppDesignPatternStrategy1 {

    public static void main(String[] args) throws Exception {
        String tipoDeVendedorFromDatabase = "VENDEDOR_NIVEL_1";
        String tipoDeVendedorParsed = parseTipoDeVendedorLikeNameClass(tipoDeVendedorFromDatabase);
        VendedorNivel vendedorNivel = new VendedorNivel(new VendedorNivel1());


        final Class<?> clazz = ClassUtils.getClass("designpatterns.behavioral.strategy."+tipoDeVendedorParsed);
        MethodUtils.getAccessibleMethod(clazz,"profitFromSale");
        Object profitFromSale = MethodUtils.invokeStaticMethod(clazz, "profitFromSale", 50);
        System.out.println(profitFromSale);

    }

    private static String parseTipoDeVendedorLikeNameClass(@NonNull String tipoVendedor) {
        return StringUtils.replaceEach( //
                WordUtils.capitalizeFully(tipoVendedor, new char[]{'_'}), //
                new String[]{"_"}, new String[]{StringUtils.EMPTY});
    }

}
