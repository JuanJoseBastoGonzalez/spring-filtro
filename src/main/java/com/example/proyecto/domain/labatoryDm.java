package com.example.proyecto.domain;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="labatory")
public class labatoryDm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
  @Autowired
  @GeneratedValue
    private String namelab;
    private String codecityreg;
    @Override
    public String toString() {
        return "labatoryDm [id=" + id + ", namelab=" + namelab + ", codecityreg=" + codecityreg + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
