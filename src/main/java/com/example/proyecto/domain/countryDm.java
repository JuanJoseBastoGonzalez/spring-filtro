package com.example.proyecto.domain;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="country")
public class countryDm {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codecountry;

    @Autowired
    private String namecountry;

    @Override
    public String toString() {
        return "countryDm [codecountry=" + codecountry + ", namecountry=" + namecountry + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
