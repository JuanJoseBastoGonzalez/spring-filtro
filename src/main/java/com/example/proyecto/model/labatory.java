package com.example.proyecto.model;

import jakarta.persistence.Entity;

@Entity
public class labatory {
    private int id;
    public labatory(int id, String namelab, String codecityreg) {
        this.id = id;
        this.namelab = namelab;
        this.codecityreg = codecityreg;
    }
    private String namelab;
    private String codecityreg;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNamelab() {
        return namelab;
    }
    public void setNamelab(String namelab) {
        this.namelab = namelab;
    }
    public String getCodecityreg() {
        return codecityreg;
    }
    public void setCodecityreg(String codecityreg) {
        this.codecityreg = codecityreg;
    }
}
