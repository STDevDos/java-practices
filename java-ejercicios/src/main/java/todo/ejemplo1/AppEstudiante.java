package todo.ejemplo1;

import java.util.stream.Stream;

public class AppEstudiante {
    @java.lang.SuppressWarnings("all")
    private static final java.util.logging.Logger log = java.util.logging.Logger
            .getLogger(AppEstudiante.class.getName());

    public static void main(String[] args) {
        log.info("" + Stream.<String>of(null, null).anyMatch(s -> s == null || s.isBlank())); // true
        log.info("" + Stream.of("d", "    ").anyMatch(s -> s == null || s.isBlank())); // true
        log.info("" + Stream.of("d", "  e  ").anyMatch(s -> s == null || s.isBlank())); // false
        /*
         * Métodos de referencia, solo funcionan con interfaces funcionales
         * y estos métodos de referencia no se le pasan parametros.
         *
         */
        IEstudiante ie = Estudiante::new;
        Estudiante estudiante = ie.crear();
        System.out.print(estudiante);
    }
}
