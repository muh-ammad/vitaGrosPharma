package com.vitagrospharma.services;

import com.vitagrospharma.models.Pet;

import java.util.List;

public interface PetService {
    List<Pet> findAll();
    Pet save(int id,Pet pet);
}
