package com.example.proyecto.services;



import java.util.List;
import java.util.Optional;

import com.example.proyecto.model.region;

public interface regionServices {
    Optional<region> findById(Integer region);
    List<region> findAll();
    region save(region region);
    Optional<region> deleteById(Integer region);
    Optional<region> update(Integer region, region cliente);
}