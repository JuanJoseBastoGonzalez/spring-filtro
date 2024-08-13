package com.example.proyecto.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyecto.model.farmacy;

public interface  farmacyRepository extends  JpaRepository<farmacy, Integer> {
}

