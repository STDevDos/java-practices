package generics;

import java.util.List;

public class AlumnoServiceImpl implements AlumnoService {

    public List<Alumno> findAll() {
        return null;
    }

    public Alumno findOne(Long id) {
        return null;
    }

    public void save(Alumno t) {
        System.out.println("Se ha guardado el ALUMNO: " + t.getNombre());
    }

    public void mostrarProfesores() {

    }


}
