package com.example.proyecto.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.proyecto.model.activeprinciple;

@RestController
@RequestMapping("/activeprinciple")
public class activeprincipleController {

    private final activeprinciple activeprincipleS;

    @Autowired
    public EmpleadoController(activeprinciple activeprincipleS) {
        this.activeprincipleS = activeprincipleS;
    }

    @GetMapping
    public ResponseEntity<List<activeprinciple>> getAllEmpleados() {
        List<activeprinciple> empleados = activeprincipleS.findAll();
        return ResponseEntity.ok(empleados);
    }

    @GetMapping("/{id}")
    public ResponseEntity<activeprinciple> getEmpleadoById(@PathVariable Integer id) {
        return activeprincipleS.findById(id)
                .map(empleado -> ResponseEntity.ok(empleado))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<activeprinciple> createEmpleado(@RequestBody activeprinciple empleado) {
        if (empleado == null) {
            return ResponseEntity.badRequest().build();
        }
        activeprinciple savedEmpleado = activeprincipleS.save(empleado);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEmpleado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<activeprinciple> updateEmpleado(@PathVariable Integer id, @RequestBody activeprinciple empleado) {
        if (!activeprincipleS.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        empleado.setCodigoJefe(id);
        activeprinciple updatedEmpleado = activeprincipleS.save(empleado);
        return ResponseEntity.ok(updatedEmpleado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpleado(@PathVariable Integer id) {
        if (!activeprincipleS.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        activeprincipleS.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
