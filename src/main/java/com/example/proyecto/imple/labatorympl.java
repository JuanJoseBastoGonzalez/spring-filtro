package com.example.proyecto.imple;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.repository.labatoryRepository;

import jakarta.transaction.Transactional;


@Service
public class labatorympl  {

    @Autowired
    private labatoryRepository repository;



    @Transactional
    @Autowired
    public void saveLabatory(laboratory labatory) {
        repository.save(labatory);
    }

    @Transactional
    @Autowired
    public void deleteLabatory(laboratory labatory) {
        repository.delete(labatory);
    }

    @Transactional
    @Autowired
    public void updateLabatory(laboratory labatory) {
        repository.save(labatory);
    }

    @Transactional
    @Autowired
    public Labatory getLabatory(int id) {
        return repository.findById(id).orElse(null);
    }

}
