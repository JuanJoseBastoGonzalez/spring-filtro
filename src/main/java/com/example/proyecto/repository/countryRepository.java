package com.example.proyecto.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyecto.model.country;
public interface  countryRepository extends  JpaRepository<country, Integer> {
}



