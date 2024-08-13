package com.example.proyecto.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="farmacymedicine")
public class farmacymedicineDm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idmedicinefatrm;
    private int price;
    @Override
    public String toString() {
        return "farmacymedicineDm [id=" + id + ", idmedicinefatrm=" + idmedicinefatrm + ", price=" + price
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }
}
