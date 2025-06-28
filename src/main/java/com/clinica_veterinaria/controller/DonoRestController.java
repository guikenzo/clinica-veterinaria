package com.clinica_veterinaria.controller;

import com.clinica_veterinaria.model.Dono;
import com.clinica_veterinaria.facade.ClinicaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/donos")
@CrossOrigin(origins = "*")
public class DonoRestController {

    @Autowired
    private ClinicaFacade clinicaFacade;

    @PostMapping
    public Dono salvarDono(@RequestBody Dono dono) {
        return clinicaFacade.salvarDono(dono);
    }
}
