package be.intecbrussel.medpetclinic.repositories;


import be.intecbrussel.medpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
