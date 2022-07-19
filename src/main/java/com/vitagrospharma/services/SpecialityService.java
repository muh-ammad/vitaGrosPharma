package com.vitagrospharma.services;

import com.vitagrospharma.models.Speciality;

import java.util.List;

public interface SpecialityService {

    List<Speciality> findAll();
    Speciality save(String name);
}
