package guru.springframework.medpetclinic.services;


import guru.springframework.medpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByID(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
