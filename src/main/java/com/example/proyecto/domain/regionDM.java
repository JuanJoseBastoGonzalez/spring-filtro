package com.example.proyecto.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="region")
public class regionDM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private String codereg;
private String namereg;
private String codecountry;
@Override
public String toString() {
    return "regionDM [codereg=" + codereg + ", namereg=" + namereg + ", codecountry=" + codecountry + ", getClass()="
            + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
