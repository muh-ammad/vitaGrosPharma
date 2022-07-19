package com.vitagrospharma.implementations;

import com.vitagrospharma.models.Speciality;
import com.vitagrospharma.models.Vet;
import com.vitagrospharma.services.SpecialityService;
import com.vitagrospharma.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VetImpl implements VetService {

    @Autowired
    SpecialityService specialityService;

    public static int id = 0;
    public static List<Vet> list = new ArrayList<Vet>();
    public static List<Speciality> ls1 = new ArrayList<>();
    public static List<Speciality> ls2 = new ArrayList<>();
    public static List<Speciality> ls3 = new ArrayList<>();
    public static List<Speciality> ls4 = new ArrayList<>();

    static {
        ls1.add(new Speciality("Dentiste"));
        ls1.add(new Speciality("Chirrurgie"));
        ls2.add(new Speciality("Radiologie"));
        ls3.add(new Speciality("Chirrurgie"));
        ls4.add(new Speciality("Radiologie"));
    }

    static {
        list.add(new Vet(generateIdValue(), "James", "Carter", "", null));
        list.add(new Vet(generateIdValue(), "Linda", "Douglas", "", ls1));
        list.add(new Vet(generateIdValue(), "Sharon", "Jenkins", "", null));
        list.add(new Vet(generateIdValue(), "Helen", "Leary", "", ls2));
        list.add(new Vet(generateIdValue(), "Rafael", "Ortega", "", ls3));
        list.add(new Vet(generateIdValue(), "Henry", "Stevens", "", ls4));
    }

    @Override
    public List<Vet> findAll() {
        return list;
    }

    @Override
    public Vet save(Vet vet) {
        System.out.println("Vet Spec "+vet.getSpecialities());
        Vet vetCreated = new Vet
                (
                generateIdValue(),
                vet.getFirstName(),
                vet.getLastName(),
                "",
                vet.getSpecialities());
        System.out.println("vetCreated "+vetCreated.getFullName());
        list.add(vetCreated);
        return vetCreated;
    }

    @Override
    public void delete(Vet vet) {

    }

    public static int generateIdValue(){
        id=++id;
        return id;
    }
}
