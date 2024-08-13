package com.example.proyecto.services;


import java.util.List;
import java.util.Optional;

import com.example.proyecto.model.customer;

public interface customerServices {
    Optional<customer> findById(Integer customer);
    List<customer> findAll();
    customer save(customer customer);
    Optional<customer> deleteById(Integer customer);
    Optional<customer> update(Integer customer, customer cliente);
}

