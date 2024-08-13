package com.example.proyecto.model;

import jakarta.persistence.Entity;

@Entity
public class farmacy {
    private int idfarmacy;
    private String namefarmacy;
    private String addressfarmacy;
    private int longs;
    public farmacy(int idfarmacy, String namefarmacy, String addressfarmacy, int longs, int latfarmacy,
            String codecityfarm, String logofarmacy) {
        this.idfarmacy = idfarmacy;
        this.namefarmacy = namefarmacy;
        this.addressfarmacy = addressfarmacy;
        this.longs = longs;
        this.latfarmacy = latfarmacy;
        this.codecityfarm = codecityfarm;
        this.logofarmacy = logofarmacy;
    }
    private int latfarmacy;
    private String codecityfarm;
    private String logofarmacy;
    public int getIdfarmacy() {
        return idfarmacy;
    }
    public void setIdfarmacy(int idfarmacy) {
        this.idfarmacy = idfarmacy;
    }
    public String getNamefarmacy() {
        return namefarmacy;
    }
    public void setNamefarmacy(String namefarmacy) {
        this.namefarmacy = namefarmacy;
    }
    public String getAddressfarmacy() {
        return addressfarmacy;
    }
    public void setAddressfarmacy(String addressfarmacy) {
        this.addressfarmacy = addressfarmacy;
    }
    public int getLongs() {
        return longs;
    }
    public void setLongs(int longs) {
        this.longs = longs;
    }
    public int getLatfarmacy() {
        return latfarmacy;
    }
    public void setLatfarmacy(int latfarmacy) {
        this.latfarmacy = latfarmacy;
    }
    public String getCodecityfarm() {
        return codecityfarm;
    }
    public void setCodecityfarm(String codecityfarm) {
        this.codecityfarm = codecityfarm;
    }
    public String getLogofarmacy() {
        return logofarmacy;
    }
    public void setLogofarmacy(String logofarmacy) {
        this.logofarmacy = logofarmacy;
    }
}
