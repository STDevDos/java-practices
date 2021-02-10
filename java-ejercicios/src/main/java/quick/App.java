package quick;

import java.math.BigDecimal;
import java.util.Objects;

public class App {

  public static void main(String[] args) {
    System.out.println(isMayorCero(BigDecimal.TEN));
    System.out.println(isMayorCero(BigDecimal.ZERO));
    System.out.println(isMayorCero(new BigDecimal(-1)));
    System.out.println(isMayorCero(null));
  }

  private static boolean isMayorCero(BigDecimal value) {
    Objects.requireNonNull(value, "El valor es Requerido.");
    return value.compareTo(BigDecimal.ZERO) == 1;
  }
}
