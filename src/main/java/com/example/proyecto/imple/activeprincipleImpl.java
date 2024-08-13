package com.example.proyecto.imple;

import com.example.proyecto.services.activeprincipleServices;
import com.example.proyecto.repository.activeprincipleRepository;
import com.example.proyecto.model.activeprinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
public class activeprincipleImpl implements activeprinciple {

    @Autowired
    private activeprincipleRepository repository;

    @Transactional
    @Override
    public List<activeprinciple> findAll() {
        return (List<activeprinciple>) repository.findAll();
    }

    @Transactional
    @Override
    public Optional<activeprinciple> findById(Integer acodigoactiveprinciple) {
        return repository.findById(acodigoactiveprinciple);
    }

    @Transactional
    @Override
    public activeprinciple save(activeprinciple activeprinciple) {
        return repository.save(activeprinciple);
    }

    @Transactional
    @Override
    public Optional<activeprinciple> update(Integer acodigoactiveprinciple, activeprinciple activeprinciple) {
        Optional<activeprinciple> activeprincipleOpt = repository.findById(acodigoactiveprinciple);
        if (activeprincipleOpt.isPresent()) {
          /*   activeprinciple activeprincipleItem = activeprincipleOpt.orElseThrow();
            activeprincipleItem.setNombreactiveprinciple(activeprinciple.getNombreactiveprinciple());
            activeprincipleItem.setNombreContacto(activeprinciple.getNombreContacto());
            activeprincipleItem.setApellidoContacto(activeprinciple.getApellidoContacto());
            activeprincipleItem.setTelefono(activeprinciple.getTelefono());
            activeprincipleItem.setFax(activeprinciple.getFax());
            activeprincipleItem.setLineaDireccion1(activeprinciple.getLineaDireccion1());
            activeprincipleItem.setLineaDireccion2(activeprinciple.getLineaDireccion2());
            activeprincipleItem.setCiudad(activeprinciple.getCiudad());
            activeprincipleItem.setRegion(activeprinciple.getRegion());
            activeprincipleItem.setCodigoPostal(activeprinciple.getCodigoPostal());
            activeprincipleItem.setCodigoEmpleado(activeprinciple.getCodigoEmpleado());
            activeprincipleItem.setLimiteCredito(activeprinciple.getLimiteCredito()); */
            return Optional.of(repository.save(activeprincipleItem));
        }
        return activeprincipleOpt;
    }

    @Transactional
    @Override
    public Optional<activeprinciple> deleteById(Integer acodigoactiveprinciple) {
        Optional<activeprinciple> activeprincipleOpt = repository.findById(acodigoactiveprinciple);
        activeprincipleOpt.ifPresent(activeprincipleItem -> {
            repository.delete(activeprincipleItem);
        });
        return activeprincipleOpt;
    }
}
