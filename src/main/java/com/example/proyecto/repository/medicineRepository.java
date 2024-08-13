package com.example.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyecto.model.medicine;
public interface  medicineRepository extends  JpaRepository<medicine, Integer> {
}


