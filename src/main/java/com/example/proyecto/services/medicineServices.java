package com.example.proyecto.services;

import java.util.List;
import java.util.Optional;

import com.example.proyecto.model.medicine;

public interface medicineServices {
    Optional<medicine> findById(Integer medicine);
    List<medicine> findAll();
    medicine save(medicine medicine);
    Optional<medicine> deleteById(Integer medicine);
    Optional<medicine> update(Integer medicine, medicine cliente);
}
