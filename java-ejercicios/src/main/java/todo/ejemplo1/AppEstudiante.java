package todo.ejemplo1;

import lombok.extern.java.Log;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;

@Log
public class AppEstudiante {

    public static void main(String[] args) {


        log.info( "" + StringUtils.isAnyBlank(null,null)); //true
        log.info( "" + StringUtils.isAnyBlank("d","    ")); //true
        log.info( "" + StringUtils.isAnyBlank("d","  e  ")); //false

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
