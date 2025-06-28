package com.clinica_veterinaria.controller;

import com.clinica_veterinaria.model.Consulta;
import com.clinica_veterinaria.facade.ClinicaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/consultas")
@CrossOrigin(origins = "*")
public class ConsultaRestController {

    @Autowired
    private ClinicaFacade clinicaFacade;

    @PostMapping
    public Consulta salvarConsulta(@RequestBody Consulta consulta) {
        return clinicaFacade.salvarConsulta(consulta);
    }
}
