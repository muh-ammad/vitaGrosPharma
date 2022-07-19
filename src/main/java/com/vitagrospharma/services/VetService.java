package com.vitagrospharma.services;

import com.vitagrospharma.models.Vet;

import java.util.List;

public interface VetService {
    List<Vet> findAll();
    Vet save(Vet vet);
    void delete(Vet vet);
}
