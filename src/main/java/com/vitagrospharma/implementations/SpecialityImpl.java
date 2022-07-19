package com.vitagrospharma.implementations;

import com.vitagrospharma.models.Speciality;
import com.vitagrospharma.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpecialityImpl implements SpecialityService {

   public static List<Speciality> list = new ArrayList<>();

    static {
        list.add(new Speciality("Radiologie"));
        list.add(new Speciality("Chirrurgie"));
        list.add(new Speciality("Veterinaire"));
        list.add(new Speciality("Dentiste"));
    }
    @Override
    public List<Speciality> findAll() {
        return list;
    }

    @Override
    public Speciality save(String name){
        list.add(new Speciality(name));
        return new Speciality(name);

    }
}
