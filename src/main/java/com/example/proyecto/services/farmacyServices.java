package com.example.proyecto.services;

import java.util.List;
import java.util.Optional;

import com.example.proyecto.model.farmacy;

public interface farmacyServices {
    Optional<farmacy> findById(Integer farmacy);
    List<farmacy> findAll();
    farmacy save(farmacy farmacy);
    Optional<farmacy> deleteById(Integer farmacy);
    Optional<farmacy> update(Integer farmacy, farmacy cliente);
}
