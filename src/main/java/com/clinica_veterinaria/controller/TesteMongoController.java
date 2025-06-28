package com.clinica_veterinaria.controller;

import com.clinica_veterinaria.model.ConexaoTeste;
import com.clinica_veterinaria.repository.ConexaoTesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/testemongo")
public class TesteMongoController {

    @Autowired
    private ConexaoTesteRepository repository;

    @GetMapping
    public String testarConexao() {
        ConexaoTeste doc = new ConexaoTeste("MongoDB conectado com sucesso!");
        repository.save(doc);
        return "Documento salvo no MongoDB!";
    }
}
