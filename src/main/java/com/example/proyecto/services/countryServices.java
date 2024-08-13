package com.example.proyecto.services;

import java.util.List;
import java.util.Optional;

import com.example.proyecto.model.country;

public interface countryServices {
    Optional<country> findById(Integer codigoCliente);
    List<country> findAll();
    country save(country cliente);
    Optional<country> deleteById(Integer codigoCliente);
    Optional<country> update(Integer codigoCliente, country cliente);
}

