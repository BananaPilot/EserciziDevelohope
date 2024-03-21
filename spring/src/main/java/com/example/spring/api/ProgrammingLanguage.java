package com.example.spring.api;

import java.time.LocalDate;

public class ProgrammingLanguage {
    private int id;
    private String name;
    private LocalDate firstAppearance;
    private String creator;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getFirstAppearance() {
        return firstAppearance;
    }

    public String getCreator() {
        return creator;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstAppearance(LocalDate firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
