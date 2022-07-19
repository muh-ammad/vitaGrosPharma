package com.vitagrospharma.models;

public class Speciality {

    private String name;

    public Speciality(String name) {
        this.name = name;
    }

    public Speciality() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}