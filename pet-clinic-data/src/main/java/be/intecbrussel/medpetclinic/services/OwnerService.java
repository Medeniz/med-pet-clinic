package be.intecbrussel.medpetclinic.services;

import be.intecbrussel.medpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastname);

}
