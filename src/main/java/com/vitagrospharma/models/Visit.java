package com.vitagrospharma.models;

import java.time.LocalDate;

public class Visit {

    private LocalDate visitDate;
    private String description;

    public Visit(LocalDate visitDate, String description) {
        this.visitDate = visitDate;
        this.description = description;
    }

    public Visit() {
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}