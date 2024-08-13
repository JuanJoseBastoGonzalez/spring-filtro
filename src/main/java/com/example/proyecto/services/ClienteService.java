package com.example.proyecto.services;

import java.util.List;
import java.util.Optional;

import com.example.proyecto.model.customer;

public interface ClienteService {
    Optional<customer> findById(Integer codigoCliente);
    List<customer> findAll();
    customer save(customer cliente);
    Optional<customer> deleteById(Integer codigoCliente);
    Optional<customer> update(Integer codigoCliente, customer cliente);
}
