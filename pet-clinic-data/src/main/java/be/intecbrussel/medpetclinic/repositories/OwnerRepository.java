package be.intecbrussel.medpetclinic.repositories;

import be.intecbrussel.medpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
