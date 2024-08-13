package com.example.proyecto.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.repository.labatoryRepository;

import jakarta.transaction.Transactional;
import com.example.proyecto.model.


@Service
public class labatorympl  {
    @Autowired
    private labatoryRepository repository;

     @Transactional
     public void saveLabatory(Labatory labatory) {
            repository.save(labatory);
            }
      @Transa      


}
