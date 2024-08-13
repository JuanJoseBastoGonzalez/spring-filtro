package com.example.proyecto.model;

import jakarta.persistence.Entity;

@Entity
public class region {
    public region(String codereg, String namereg, String codecountry) {
        this.codereg = codereg;
        this.namereg = namereg;
        this.codecountry = codecountry;
    }
    private String codereg;
    private String namereg;
    private String codecountry;
    public String getCodereg() {
        return codereg;
    }
    public void setCodereg(String codereg) {
        this.codereg = codereg;
    }
    public String getNamereg() {
        return namereg;
    }
    public void setNamereg(String namereg) {
        this.namereg = namereg;
    }
    public String getCodecountry() {
        return codecountry;
    }
    public void setCodecountry(String codecountry) {
        this.codecountry = codecountry;
    }
}
