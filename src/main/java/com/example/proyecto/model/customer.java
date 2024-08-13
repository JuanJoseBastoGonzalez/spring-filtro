package com.example.proyecto.model;

import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class customer {
     private String idcustomer;
     private String nnamecustomer;
     private String codecitycustomer;
     public customer(String idcustomer, String nnamecustomer, String codecitycustomer, String emailcutomer,
            Date birthdate, int lon, int latitud) {
        this.idcustomer = idcustomer;
        this.nnamecustomer = nnamecustomer;
        this.codecitycustomer = codecitycustomer;
        this.emailcutomer = emailcutomer;
        this.birthdate = birthdate;
        this.lon = lon;
        this.latitud = latitud;
    }
    private String emailcutomer;
     private Date birthdate;
     private int lon;
     public String getIdcustomer() {
        return idcustomer;
    }
    public void setIdcustomer(String idcustomer) {
        this.idcustomer = idcustomer;
    }
    public String getNnamecustomer() {
        return nnamecustomer;
    }
    public void setNnamecustomer(String nnamecustomer) {
        this.nnamecustomer = nnamecustomer;
    }
    public String getCodecitycustomer() {
        return codecitycustomer;
    }
    public void setCodecitycustomer(String codecitycustomer) {
        this.codecitycustomer = codecitycustomer;
    }
    public String getEmailcutomer() {
        return emailcutomer;
    }
    public void setEmailcutomer(String emailcutomer) {
        this.emailcutomer = emailcutomer;
    }
    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public int getLon() {
        return lon;
    }
    public void setLon(int lon) {
        this.lon = lon;
    }
    public int getLatitud() {
        return latitud;
    }
    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }
    private int latitud;
}
