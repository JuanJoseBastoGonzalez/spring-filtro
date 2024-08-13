package com.example.proyecto.imple;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import com.example.proyecto.model.customer;
import com.example.proyecto.repository.customerRepository;

@Service
public class customermpl implements customer {
    @Autowired
    private customerRepository repository;

   
    public List<customer> getAll() {
        return repository.findAll();
    }

  
    public customer getbyid(int id) {
        return repository.findById(id).orElse(null);
    }

  
    public customer create(customer customer) {
        return repository.save(customer);
    }

    
    public customer update(customer customer) {
        return repository.save(customer);
    }

    
    public void delete(int id) {
        repository.deleteById(id);
    }

}
