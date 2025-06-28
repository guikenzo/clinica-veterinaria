package com.clinica_veterinaria.controller;

import com.clinica_veterinaria.model.Dono;
import com.clinica_veterinaria.service.DonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/donos")
@CrossOrigin(origins = "*")
public class DonoRestController {

    @Autowired
    private DonoService donoService;

    @PostMapping
    public Dono salvar(@RequestBody Dono dono) {
        return donoService.salvarDono(dono);
    }
}
