package com.example.proyecto.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.proyecto.model.country;
import org.springframework.http.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country")
public class countryController {
    
    private final country countryS;

    @Autowired
    public countryConller(country countryS) {
        this.countryS = countryS;
    }

    @GetMapping
    public ResponseEntity<List<country>> getAllcountrys() {
        List<country> country = countryS.findAll();
        return ResponseEntity.ok(country);
    }

    @GetMapping("/{id}")
    public ResponseEntity<country> getcountryById(@PathVariable Integer id) {
        return countryS.findById(id)
                .map(country -> ResponseEntity.ok(country))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<country> createcountry(@RequestBody country country) {
        if (country == null) {
            return ResponseEntity.badRequest().build();
        }
        country savedcountry = countryS.save(country);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedcountry);
    }

    @PutMapping("/{id}")
    public ResponseEntity<country> updatecountry(@PathVariable Integer id, @RequestBody country country) {
        if (!countryS.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        country.setCodigoJefe(id);
        country updatedcountry = countryS.save(country);
        return ResponseEntity.ok(updatedcountry);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletecountry(@PathVariable Integer id) {
        if (!countryS.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        countryS.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}


