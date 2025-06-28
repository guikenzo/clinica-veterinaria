package com.clinica_veterinaria.controller;

import com.clinica_veterinaria.adapter.ViaCepAdapter;
import com.clinica_veterinaria.model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/endereco")
@CrossOrigin(origins = "*")
public class EnderecoRestController {

    @Autowired
    private ViaCepAdapter viaCepAdapter;

    @GetMapping("/cep/{cep}")
    public Endereco getEnderecoPorCep(@PathVariable String cep) {
        return viaCepAdapter.buscarEnderecoPorCep(cep);
    }
}
