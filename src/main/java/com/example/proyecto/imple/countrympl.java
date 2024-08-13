package com.example.proyecto.imple;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.proyecto.model.country;
import com.example.proyecto.repository.countryRepository;

@Service
public class countrympl extends country {
    @Autowired
    private countryRepository countryrepository;

    @Transactional
  
    public List<country> getAll() {
        return (List<country>) countryrepository.findAll();
    }

    @Transactional
    
    public Optional<country> getCountry(String codeconuntry) {
        return countryrepository.findById(codeconuntry);
    }

    @Transactional
    
    public country save(country country) {
        return countryrepository.save(country);
    }

    @Transactional
   
    public void delete(int id) {
        countryrepository.deleteById(id);
    }

    @Transactional
   
    public void update(country country) {
        countryrepository.save(country);
    }

    @Transactional
   
    public List<country> getAllCountry() {
        return (List<country>) countryrepository.findAll();
    }

    @Transactional
    public Optional<country> getCountry(int id) {
        return countryrepository.findById(id);
    }

}
