package com.example.proyecto.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.model.farmacy;
import com.example.proyecto.repository.farmacyRepository;

import jakarta.transaction.Transactional;

@Service
public class farmacympl {

    @Autowired
    private farmacyRepository repository;
    
@Transactional
    public List<farmacy> getAll() {
        return repository.findAll();
    }

    @Transactional
    public farmacy getFarmaciaById(int idfarmacy) {
        return repository.findById(idfarmacy).orElse(null);
    }

    @Transactional
    public farmacy createFarmacia(farmacy farmacia) {
        return repository.save(farmacia);
    }

    @Transactional
    public farmacy updateFarmacia(farmacy farmacia) {
        return repository.save(farmacia);
    }

    @Transactional
    public void deleteFarmacia(int idfarmacy) {
        repository.deleteById(idfarmacy);
    }

}
