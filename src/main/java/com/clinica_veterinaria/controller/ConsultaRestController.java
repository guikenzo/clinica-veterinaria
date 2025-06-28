package com.clinica_veterinaria.controller;

import com.clinica_veterinaria.model.Consulta;
import com.clinica_veterinaria.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/consultas")
@CrossOrigin(origins = "*")
public class ConsultaRestController {

    @Autowired
    private ConsultaService consultaService;

    @PostMapping
    public Consulta agendarConsulta(@RequestBody Consulta consulta) {
        return consultaService.agendarConsulta(consulta);
    }
}
