package com.clinica_veterinaria.controller;

import com.clinica_veterinaria.model.Animal;
import com.clinica_veterinaria.facade.ClinicaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animais")
@CrossOrigin(origins = "*")
public class AnimalRestController {

    @Autowired
    private ClinicaFacade clinicaFacade;

    @PostMapping
    public Animal salvarAnimal(@RequestBody Animal animal) {
        return clinicaFacade.salvarAnimal(animal);
    }

    @GetMapping
    public List<Animal> listarTodosAnimais() {
        return clinicaFacade.listarAnimais();
    }
}
