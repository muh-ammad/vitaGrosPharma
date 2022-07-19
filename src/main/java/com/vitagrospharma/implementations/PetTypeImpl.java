package com.vitagrospharma.implementations;

import com.vitagrospharma.models.PetType;
import com.vitagrospharma.services.OwnerService;
import com.vitagrospharma.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetTypeImpl implements PetTypeService {

    public static List<PetType> list = new ArrayList<>();

    static {
        list.add(new PetType("Bird"));
        list.add(new PetType("Cat"));
        list.add(new PetType("Dog"));
        list.add(new PetType("Bird"));
        list.add(new PetType("Hamster"));
        list.add(new PetType("Lizard"));
    }

    @Autowired
    OwnerService ownerService;

    @Override
    public List<PetType> findAll() {
        return list;
    }

    @Override
    public PetType save(String name) {
        PetType petTypeCreated = new PetType(name);
        list.add(petTypeCreated);
        return petTypeCreated;
    }
}
