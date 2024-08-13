package com.example.proyecto.model;

import jakarta.persistence.Entity;

@Entity
public class farmacymedicine {
  private int idfarmacy;
  private int idmedicinefatrm;
  private int price;
public int getIdfarmacy() {
    return idfarmacy;
}
public farmacymedicine(int idfarmacy, int idmedicinefatrm, int price) {
    this.idfarmacy = idfarmacy;
    this.idmedicinefatrm = idmedicinefatrm;
    this.price = price;
}
public void setIdfarmacy(int idfarmacy) {
    this.idfarmacy = idfarmacy;
}
public int getIdmedicinefatrm() {
    return idmedicinefatrm;
}
public void setIdmedicinefatrm(int idmedicinefatrm) {
    this.idmedicinefatrm = idmedicinefatrm;
}
public int getPrice() {
    return price;
}
public void setPrice(int price) {
    this.price = price;
}
}
