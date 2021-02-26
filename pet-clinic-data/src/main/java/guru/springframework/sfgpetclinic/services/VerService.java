package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by dz on 26/02/21.
 */
public interface VerService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
