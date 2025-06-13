package todo.ejemplo1;

import org.apache.commons.lang3.StringUtils;

public class AppEstudiante {
    @java.lang.SuppressWarnings("all")
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(AppEstudiante.class.getName());

    public static void main(String[] args) {
        log.info("" + StringUtils.isAnyBlank(null, null)); //true
        log.info("" + StringUtils.isAnyBlank("d", "    ")); //true
        log.info("" + StringUtils.isAnyBlank("d", "  e  ")); //false
        /*
         * Métodos de referencia, solo funcionan con interfaces funcionales
         * y estos métodos de referencia no se le pasan parametros.
         *
         * */
        IEstudiante ie = Estudiante::new;
        Estudiante estudiante = ie.crear();
        System.out.print(estudiante);
    }
}
