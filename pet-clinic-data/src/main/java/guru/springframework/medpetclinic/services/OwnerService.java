package guru.springframework.medpetclinic.services;

import guru.springframework.medpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastname);

}
