package com.clinica_veterinaria.service;

import com.clinica_veterinaria.model.Consulta;
import com.clinica_veterinaria.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    public Consulta salvar(Consulta consulta) {
        return consultaRepository.save(consulta);
    }
}
