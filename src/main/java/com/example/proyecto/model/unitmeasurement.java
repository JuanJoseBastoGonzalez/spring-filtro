package com.example.proyecto.model;

import jakarta.persistence.Entity;

@Entity
public class unitmeasurement {
    private int idum;
    private String nameum;
    public int getIdum() {
        return idum;
    }
    public void setIdum(int idum) {
        this.idum = idum;
    }
    public unitmeasurement(int idum, String nameum) {
        this.idum = idum;
        this.nameum = nameum;
    }
    public String getNameum() {
        return nameum;
    }
    public void setNameum(String nameum) {
        this.nameum = nameum;
    }
}
