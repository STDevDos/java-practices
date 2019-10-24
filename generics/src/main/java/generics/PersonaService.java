package generics;

import java.util.List;

public interface PersonaService<T> {
    List<T> findAll();

    T findOne(Long id);

    void save(T t);
}
