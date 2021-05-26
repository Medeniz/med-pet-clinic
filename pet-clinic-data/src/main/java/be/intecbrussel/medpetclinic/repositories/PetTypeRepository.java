package be.intecbrussel.medpetclinic.repositories;

import be.intecbrussel.medpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
