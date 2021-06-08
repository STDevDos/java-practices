package quick.platzi;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {

    public static void main(String[] args) {
        Function<Integer,Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        Persona persona = new Persona("Froy",'M',23);
        System.out.println(persona.isHombreAndMayorDeEdad());
    }

    static class Persona {

        private String nombre;
        private char sexo;
        private int edad;
        private Predicate<Persona> isHombreAndMayorDeEdad;

        public Persona(String nombre,char sexo,int edad){
            this.nombre = nombre;
            this.sexo = sexo;
            this.edad = edad;
            isHombreAndMayorDeEdad = persona -> persona.sexo == 'M' && persona.edad >= 18;
        }

        public boolean isHombreAndMayorDeEdad() {
            return isHombreAndMayorDeEdad.test(this);
        }
    }


}
