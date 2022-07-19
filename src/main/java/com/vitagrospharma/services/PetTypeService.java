package com.vitagrospharma.services;

import com.vitagrospharma.models.PetType;

import java.util.List;

public interface PetTypeService {
   List<PetType> findAll();
   PetType save(String name);
}
