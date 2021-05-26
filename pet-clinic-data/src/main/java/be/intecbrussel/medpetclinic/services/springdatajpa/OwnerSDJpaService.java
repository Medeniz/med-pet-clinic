package be.intecbrussel.medpetclinic.services.springdatajpa;

import be.intecbrussel.medpetclinic.model.Owner;
import be.intecbrussel.medpetclinic.repositories.OwnerRepository;
import be.intecbrussel.medpetclinic.repositories.PetRepository;
import be.intecbrussel.medpetclinic.repositories.PetTypeRepository;
import be.intecbrussel.medpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeReposıtory;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
                             PetTypeRepository petTypeReposıtory) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeReposıtory = petTypeReposıtory;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {

        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);

    }

    @Override
    public Owner findByLastName(String lastname) {
        return ownerRepository.findByLastName(lastname);
    }
}
