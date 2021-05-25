package be.intecbrussel.medpetclinic.repositories;

import be.intecbrussel.medpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
