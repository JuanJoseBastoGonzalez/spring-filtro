package com.example.proyecto.services;

import java.util.List;
import java.util.Optional;

import com.example.proyecto.model.country;

public interface countryServices {
    Optional<country> findById(Integer codecity);
    List<country> findAll();
    country save(country codecity);
    Optional<country> deleteById(Integer codecity);
    Optional<country> update(Integer codecity, country cliente);
}

