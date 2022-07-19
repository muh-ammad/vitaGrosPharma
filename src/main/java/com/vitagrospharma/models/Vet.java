package com.vitagrospharma.models;

import java.util.List;

public class Vet {

    private int id;
    private String firstName;
    private  String lastName;
    private String fullName;
    private List<Speciality> specialities;

    public Vet(int id, String firstName, String lastName, String fullName, List<Speciality> specialities) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName+" "+lastName;
        this.specialities = specialities;
    }

    public Vet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = firstName+" "+lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(List<Speciality> specialities) {
        this.specialities = specialities;
    }
}