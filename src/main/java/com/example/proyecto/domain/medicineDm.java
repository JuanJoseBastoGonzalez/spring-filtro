package com.example.proyecto.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="medicine")
public class medicineDm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private  int id;
private String proceedings;
private String namemedicine;
private String healthregister;
private String description;
private String descriptionshort;
private int codemodeadmin;
private int codeap;
private int codeum;
private String  namerol;
private int codelab;
@Override
public String toString() {
    return "medicineDm [id=" + id + ", proceedings=" + proceedings + ", namemedicine=" + namemedicine
            + ", healthregister=" + healthregister + ", description=" + description + ", descriptionshort="
            + descriptionshort + ", codemodeadmin=" + codemodeadmin + ", codeap=" + codeap + ", codeum=" + codeum
            + ", namerol=" + namerol + ", codelab=" + codelab + ", getClass()=" + getClass() + ", hashCode()="
            + hashCode() + ", toString()=" + super.toString() + "]";
}

}
