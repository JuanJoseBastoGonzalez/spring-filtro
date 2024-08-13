package com.example.proyecto.imple;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.proyecto.repository.farmacyRepository;
import jakarta.transaction.Transactional;
import com.example.proyecto.model.farmacy;

@Service
public class farmacympl implements {

    @Autowired
    private farmacyRepository repository;

    public List<farmacy> getAll() {
        return repository.findAll();
    }

    public farmacy getFarmaciaById(Long id) {
        return repository.findById(id).orElse(null);
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
    public void deleteFarmacia(Long id) {
        repository.deleteById(id);
    }

}
