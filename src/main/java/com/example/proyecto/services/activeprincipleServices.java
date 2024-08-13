package com.example.proyecto.services;

import java.util.List;
import java.util.Optional;

import com.example.proyecto.model.activeprinciple;

public interface activeprincipleServices {
    Optional<activeprinciple> findById(Integer idap);
    List<activeprinciple> findAll();
    activeprinciple save(activeprinciple idap);
    Optional<activeprinciple> deleteById(Integer idap);
    Optional<activeprinciple> update(Integer idap, activeprinciple cliente);
}