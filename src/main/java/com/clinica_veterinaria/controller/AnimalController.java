package com.clinica_veterinaria.controller;

import com.clinica_veterinaria.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping
    public String helloWorld() {
        return animalService.animal("Guilherme");
    }
}
