package com.example.proyecto.domain;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class customerDm {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     
    private int idcustomer;
    private String namecustomer;
    private String lastnamecustomer;
    private String codecitycustomer;
    private String emailcustomer;
    private Date birthdate;
    private int lon;
    private int latitud;
    @Override
    public String toString() {
        return "customerDm [idcustomer=" + idcustomer + ", namecustomer=" + namecustomer + ", lastnamecustomer="
                + lastnamecustomer + ", codecitycustomer=" + codecitycustomer + ", emailcustomer=" + emailcustomer
                + ", birthdate=" + birthdate + ", lon=" + lon + ", latitud=" + latitud + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
