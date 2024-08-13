
package com.example.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyecto.model.customer;
public interface  customerRepository extends  JpaRepository<customer, Integer> {
}



