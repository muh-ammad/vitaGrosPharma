package com.vitagrospharma.implementations;

import com.vitagrospharma.models.Owner;
import com.vitagrospharma.models.Pet;
import com.vitagrospharma.models.PetType;
import com.vitagrospharma.services.OwnerService;
import com.vitagrospharma.services.PetService;
import com.vitagrospharma.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PetImpl implements PetService {

    public static List<Pet> list = new ArrayList<Pet>();
    @Autowired
    private OwnerService ownerService;

/*
    static {
        list.add(new Pet("Leo", LocalDate.of(2022, 1, 13), new PetType("Bird"), null));
        list.add(new Pet("Basil", LocalDate.of(2022, 2, 14), new PetType("Cat"), null));
        list.add(new Pet("Jewel", LocalDate.of(2022, 3, 15), new PetType("Dog"), null));
        list.add(new Pet("Rosy", LocalDate.of(2022, 4, 16), new PetType("Hamster"), null));
        list.add(new Pet("Iggy", LocalDate.of(2022, 5, 17), new PetType("Bird"), null));
        list.add(new Pet("George", LocalDate.of(2022, 6, 18), new PetType("Cat"), null));
        list.add(new Pet("Max", LocalDate.of(2022, 7, 19), new PetType("Dog"), null));
        list.add(new Pet("Samantha", LocalDate.of(2022, 8, 20), new PetType("Hamster"), null));
        list.add(new Pet("Lucky", LocalDate.of(2022, 9, 21), new PetType("Lizard"), null));
        list.add(new Pet("Mulligan", LocalDate.of(2022, 10, 22), new PetType("Bird"), null));
        list.add(new Pet("Freddy", LocalDate.of(2022, 11, 23), new PetType("Cat"), null));
        list.add(new Pet("Sly", LocalDate.of(2022, 12, 24), new PetType("Dog"), null));
        list.add(new Pet("Leo", LocalDate.of(2022, 1, 11), new PetType("Dog"), null));
    }*/

    @Override
    public List<Pet> findAll() {
        Iterator<Owner> iterator = ownerService.findAll().iterator();
        while (iterator.hasNext()) {
            Owner owner = iterator.next();
            // System.out.println("Iterator " + owner.getFirstName());
            for (Pet pet : owner.getPets()) {
                list.add(pet);
            }
        }
        return list;
    }

    @Override
    public Pet save(int id, Pet pet) {
        Pet petCreated = new Pet();
        petCreated.setName(pet.getName());
        petCreated.setDateOfBirth(pet.getDateOfBirth());
        petCreated.setPetType(pet.getPetType());
        petCreated.setVisits(pet.getVisits());
        list.add(petCreated);
        Owner owner = ownerService.findAll().stream().filter(o -> o.getId() == id).findAny().orElse(null);
        owner.getPets().add(petCreated);
        return petCreated;
    }
}
