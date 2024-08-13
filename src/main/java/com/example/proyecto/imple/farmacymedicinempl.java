package com.example.proyecto.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.model.farmacymedicine;
import com.example.proyecto.repository.farmacymedicineRepository;

import jakarta.transaction.Transactional;

@Service
public class farmacymedicinempl  {

    @Autowired
    private farmacymedicineRepository repository;

    @Transactional
    public List<farmacymedicine> getAll() {
        return (List<farmacymedicine>) repository.findAll();
    }

    @Transactional
    public farmacymedicine create(farmacymedicine farmacymedicine) {
        return repository.save(farmacymedicine);
    }

    @Transactional
    public farmacymedicine update(farmacymedicine farmacymedicine) {
        return repository.save(farmacymedicine);
    }

    @Transactional
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Transactional
    public farmacymedicine getOne(int id) {
        return repository.findById(id).orElse(null);
    }

}
