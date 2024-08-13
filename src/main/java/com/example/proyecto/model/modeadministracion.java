package com.example.proyecto.model;

import jakarta.persistence.Entity;

@Entity
public class modeadministracion {
    
    private int id;
    private String descriptionmode;
    public int getId() {
        return id;
    }
    public modeadministracion(int id, String descriptionmode) {
        this.id = id;
        this.descriptionmode = descriptionmode;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescriptionmode() {
        return descriptionmode;
    }
    public void setDescriptionmode(String descriptionmode) {
        this.descriptionmode = descriptionmode;
    }
    
}
