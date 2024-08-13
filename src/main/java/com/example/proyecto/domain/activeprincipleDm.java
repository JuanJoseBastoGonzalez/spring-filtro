package com.example.proyecto.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "activeprinciple")
public class activeprincipleDm {
     
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nameap;



    

    @Override
    public String toString() {
        return "activeprincipleDm [id=" + id + ", nameap=" + nameap + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }

   
}
