package com.example.proyecto.services;

import java.util.List;
import java.util.Optional;

import com.example.proyecto.model.activeprinciple;

public interface activeprincipleServices {
    Optional<activeprinciple> findById(Integer codigoCliente);
    List<activeprinciple> findAll();
    activeprinciple save(activeprinciple cliente);
    Optional<activeprinciple> deleteById(Integer codigoCliente);
    Optional<activeprinciple> update(Integer codigoCliente, activeprinciple cliente);
}