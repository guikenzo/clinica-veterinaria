package com.clinica_veterinaria.controller;

import com.clinica_veterinaria.model.Animal;
import com.clinica_veterinaria.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animais")
@CrossOrigin(origins = "*") // permite requisições de qualquer origem (útil para front local)
public class AnimalRestController {

    @Autowired
    private AnimalRepository animalRepository;

    @PostMapping
    public Animal salvarAnimal(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    // ✅ Este é o novo endpoint que resolve o problema
    @GetMapping
    public List<Animal> listarAnimais() {
        return animalRepository.findAll();
    }
}
