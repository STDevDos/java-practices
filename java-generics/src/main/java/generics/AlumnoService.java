package generics;

public interface AlumnoService extends PersonaService<Alumno> {
    void mostrarProfesores();
}
