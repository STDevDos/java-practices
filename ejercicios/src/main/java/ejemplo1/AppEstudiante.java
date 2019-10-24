package ejemplo1;

/**
 * Main class
 *
 * @author Froy
 */
public class AppEstudiante {

    public static void main(String[] args) {
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
