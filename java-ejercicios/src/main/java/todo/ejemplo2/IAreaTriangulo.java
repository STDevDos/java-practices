package todo.ejemplo2;

import java.math.BigDecimal;

/**
 * Una interfaz funcional solo implementa un solo método.
 *
 * @author Muguruza
 */
@FunctionalInterface
public interface IAreaTriangulo {
    public BigDecimal obtenerArea(BigDecimal base, BigDecimal altura);
}
