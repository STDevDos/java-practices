package ejemplo2;

import java.math.BigDecimal;


/**
 * @author Froy
 */
public class AppTriangulo {

    public static void main(String[] args) {
        BigDecimal base = new BigDecimal(5.2);
        BigDecimal altura = new BigDecimal(10.1);
        IAreaTriangulo at = (x, y) -> (base.multiply(altura)).divide(new BigDecimal(2));
        System.out.println(at.obtenerArea(base, altura));

    }

}
