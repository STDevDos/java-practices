package generics;

import java.util.List;

public class ProfesorServiceImpl implements ProfesorService {

    public List<Profesor> findAll() {
        return null;
    }

    public Profesor findOne(Long id) {
        return null;
    }

    public void save(Profesor t) {
        System.out.println("Se ha guardado el PROFERSOR: " + t.getNombre());
    }

    public void mostrarAlumnos() {

    }

}
