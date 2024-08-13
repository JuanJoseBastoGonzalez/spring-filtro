package com.example.proyecto.services;

import java.util.List;
import java.util.Optional;

import com.example.proyecto.model.labatory;

public interface flabatoryServices {
    Optional<labatory> findById(Integer labatory);
    List<labatory> findAll();
    labatory save(labatory labatory);
    Optional<labatory> deleteById(Integer labatory);
    Optional<labatory> update(Integer labatory, labatory cliente);
}
