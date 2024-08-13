package com.example.proyecto.model;

import jakarta.persistence.Entity;

@Entity
public class activeprinciple {
    private int  idap;
    private String nameap;
    public int getIdap() {
        return idap;
    }
    public activeprinciple(int idap, String nameap) {
        this.idap = idap;
        this.nameap = nameap;
    }
    public void setIdap(int idap) {
        this.idap = idap;
    }
    public String getNameap() {
        return nameap;
    }
    public void setNameap(String nameap) {
        this.nameap = nameap;
    }
}
