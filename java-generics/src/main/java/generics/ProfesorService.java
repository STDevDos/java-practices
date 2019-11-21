package generics;

public interface ProfesorService extends PersonaService<Profesor> {

    void mostrarAlumnos();

}
