package com.clinica_veterinaria.controller;

import com.clinica_veterinaria.model.Animal;
import com.clinica_veterinaria.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/animais")
@CrossOrigin(origins = "*") // Para permitir requisições do front
public class AnimalRestController {

    @Autowired
    private AnimalRepository animalRepository;

    @PostMapping
    public Animal salvarAnimal(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }
}
