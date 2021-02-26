package guru.springframework.sfgpetclinic.services;


import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by dz on 26/02/21.
 */
public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
