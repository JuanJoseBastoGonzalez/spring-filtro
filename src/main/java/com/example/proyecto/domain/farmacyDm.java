package com.example.proyecto.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="farmacy")
public class farmacyDm {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idfarmacy;

    public String namefarmacy;
    public String addressfarmacy;
    public int longs;
    public int latfarmacy;
    public String phonefarmacy;
    public String logofarmacy;
    @Override
    public String toString() {
        return "farmacyDm [idfarmacy=" + idfarmacy + ", namefarmacy=" + namefarmacy + ", addressfarmacy="
                + addressfarmacy + ", longs=" + longs + ", latfarmacy=" + latfarmacy + ", phonefarmacy=" + phonefarmacy
                + ", logofarmacy=" + logofarmacy + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }
}
