package com.vitagrospharma.implementations;

import com.vitagrospharma.models.Owner;
import com.vitagrospharma.models.Pet;
import com.vitagrospharma.models.PetType;
import com.vitagrospharma.services.OwnerService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class OwnerImpl implements OwnerService {

    public static List<Owner> list = new ArrayList<>();
    public static int id = 0;
    public static List<Pet> petList1 = new ArrayList<>();
    public static List<Pet> petList2 = new ArrayList<>();
    public static List<Pet> petList3 = new ArrayList<>();
    public static List<Pet> petList4 = new ArrayList<>();
    public static List<Pet> petList5 = new ArrayList<>();
    public static List<Pet> petList6 = new ArrayList<>();
    public static List<Pet> petList7 = new ArrayList<>();
    public static List<Pet> petList8 = new ArrayList<>();
    public static List<Pet> petList9 = new ArrayList<>();
    public static List<Pet> petList10 = new ArrayList<>();

    static {
        petList1.add(new Pet("Leo", LocalDate.of(2022, 1, 13), new PetType("Bird"), null));
        petList2.add(new Pet("Basil", LocalDate.of(2022, 2, 14), new PetType("Cat"), null));
        petList3.add(new Pet("Jewel", LocalDate.of(2022, 3, 15), new PetType("Dog"), null));
        petList3.add(new Pet("Rosy", LocalDate.of(2022, 4, 16), new PetType("Hamster"), null));
        petList4.add(new Pet("Iggy", LocalDate.of(2022, 5, 17), new PetType("Bird"), null));
        petList5.add(new Pet("George", LocalDate.of(2022, 6, 18), new PetType("Cat"), null));
        petList6.add(new Pet("Max", LocalDate.of(2022, 7, 19), new PetType("Dog"), null));
        petList6.add(new Pet("Samantha", LocalDate.of(2022, 8, 20), new PetType("Hamster"), null));
        petList7.add(new Pet("Lucky", LocalDate.of(2022, 9, 21), new PetType("Lizard"), null));
        petList8.add(new Pet("Mulligan", LocalDate.of(2022, 10, 22), new PetType("Bird"), null));
        petList9.add(new Pet("Freddy", LocalDate.of(2022, 11, 23), new PetType("Cat"), null));
        petList10.add(new Pet("Lucky", LocalDate.of(2022, 12, 24), new PetType("Dog"), null));
        petList10.add(new Pet("Sly", LocalDate.of(2022, 1, 11), new PetType("Dog"), null));
    }

    static {
        list.add(new Owner(generateIdValue(), "George", "Franklin", "110 W Liberty St.", "Madison", "6085546712", petList1));
        list.add(new Owner(generateIdValue(), "Betty", "Davis", "110 W Liberty St.", "Sun Prairie", "6085546712", petList2));
        list.add(new Owner(generateIdValue(), "Eduardo", "Rodriquez", "110 W Liberty St.", "MacFarland", "6085546712", petList3));
        list.add(new Owner(generateIdValue(), "Harold", "Davis", "110 W Liberty St.", "Windsor", "6085546712", petList4));
        list.add(new Owner(generateIdValue(), "Peter", "McTavish", "110 W Liberty St.", "Madison", "6085546712", petList5));
        list.add(new Owner(generateIdValue(), "Jean", "Coleman", "110 W Liberty St.", "Monoma", "6085546712", petList6));
        list.add(new Owner(generateIdValue(), "Jeff", "Black", "110 W Liberty St.", "Monoma", "6085546712", petList7));
        list.add(new Owner(generateIdValue(), "Maria", "Escobito", "110 W Liberty St.", "Madison", "6085546712", petList8));
        list.add(new Owner(generateIdValue(), "David", "Shroeder", "110 W Liberty St.", "Madison", "6085546712", petList9));
        list.add(new Owner(generateIdValue(), "Carlos", "Estaban", "110 W Liberty St.", "Madison", "6085546712", petList10));
    }

    @Override
    public List<Owner> findAll() {
        return list;
    }

    @Override
    public Owner findOne(int id) {
        Owner owner = new Owner();
        for (Owner o : list) {
            if (o.getId() == id) {
                owner = o;
            }
        }
        return owner;
    }

    @Override
    public Owner save(Owner owner) {
        Owner ownerCreated = new Owner();
        ownerCreated.setId(generateIdValue());
        ownerCreated.setFirstName(owner.getFirstName());
        ownerCreated.setLastName(owner.getLastName());
        ownerCreated.setAddress(owner.getAddress());
        ownerCreated.setCity(owner.getAddress());
        ownerCreated.setTelephone(owner.getTelephone());
        list.add(ownerCreated);
        return ownerCreated;
    }

    @Override
    public Owner update(Owner owner) {
        Owner ownerUpdated = list.stream().filter(o-> o.getId()  == owner.getId()).findAny().orElse(null);
        ownerUpdated.setFirstName(owner.getFirstName());
        ownerUpdated.setLastName(owner.getLastName());
        ownerUpdated.setAddress(owner.getAddress());
        ownerUpdated.setCity(owner.getCity());
        ownerUpdated.setTelephone(owner.getTelephone());
        System.out.println(" Update Service  "+ownerUpdated.getId());
        System.out.println("ownerUpdated Firstname " + ownerUpdated.getFirstName());
        System.out.println("ownerUpdated LastName " + ownerUpdated.getLastName());
        return ownerUpdated;
    }

    @Override
    public void delete(int id) {

    }

    public static int generateIdValue() {
        id = ++id;
        return id;
    }
}
