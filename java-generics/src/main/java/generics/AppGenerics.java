package generics;

public class AppGenerics {

    public static void main(String[] args) {

        PersonaService<Profesor> profesorService = new ProfesorServiceImpl();
        PersonaService<Alumno> alumnoService = new AlumnoServiceImpl();

        Profesor profesor = new Profesor("Froy el profesor.");
        profesorService.save(profesor);

        Alumno alumno = new Alumno("Froy el alumno.");
        alumnoService.save(alumno);

    }
}
