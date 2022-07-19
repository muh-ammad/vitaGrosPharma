package com.vitagrospharma.services;

import com.vitagrospharma.models.Owner;

import java.util.List;

public interface OwnerService {
    List<Owner> findAll();
    Owner findOne(int id);
    Owner save(Owner owner);
    Owner update(Owner owner);
    void delete(int id);
}
