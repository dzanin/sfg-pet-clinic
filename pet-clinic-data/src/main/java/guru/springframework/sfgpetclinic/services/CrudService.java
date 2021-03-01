package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by dz on 01/03/21.
 */
public interface CrudService <T, ID>{
    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);

}
