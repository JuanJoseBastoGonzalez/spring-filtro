package com.example.proyecto.services;


import java.util.List;
import java.util.Optional;

import com.example.proyecto.model. unitmeasurement;

public interface unitmeasurementServices
{
    Optional< unitmeasurement> findById(Integer  unitmeasurement);
    List< unitmeasurement> findAll();
     unitmeasurement save( unitmeasurement  unitmeasurement);
    Optional< unitmeasurement> deleteById(Integer  unitmeasurement);
    Optional< unitmeasurement> update(Integer  unitmeasurement,  unitmeasurement cliente);
}