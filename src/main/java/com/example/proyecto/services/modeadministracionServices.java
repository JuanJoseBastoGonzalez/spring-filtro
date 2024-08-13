package com.example.proyecto.services;



import java.util.List;
import java.util.Optional;

import com.example.proyecto.model.modeadministracion;

public interface modeadministracionServices {
    Optional<modeadministracion> findById(Integer modeadministracion);
    List<modeadministracion> findAll();
    modeadministracion save(modeadministracion modeadministracion);
    Optional<modeadministracion> deleteById(Integer modeadministracion);
    Optional<modeadministracion> update(Integer modeadministracion, modeadministracion cliente);
}