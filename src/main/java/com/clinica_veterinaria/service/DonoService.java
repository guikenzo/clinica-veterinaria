package com.clinica_veterinaria.service;

import com.clinica_veterinaria.model.Dono;
import com.clinica_veterinaria.repository.DonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonoService {

    @Autowired
    private DonoRepository donoRepository;

    public Dono salvar(Dono dono) {
        return donoRepository.save(dono);
    }
}
