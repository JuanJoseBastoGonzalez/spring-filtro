package com.example.proyecto.model;

import jakarta.persistence.Entity;

@Entity
public class country {
    private String codecity;
    private String namecity;
    public String getCodecity() {
        return codecity;
    }
    public void setCodecity(String codecity) {
        this.codecity = codecity;
    }
    public country(String codecity, String namecity, String codereg) {
        this.codecity = codecity;
        this.namecity = namecity;
        this.codereg = codereg;
    }
    public String getNamecity() {
        return namecity;
    }
    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }
    public String getCodereg() {
        return codereg;
    }
    public void setCodereg(String codereg) {
        this.codereg = codereg;
    }
    private String codereg;
}
