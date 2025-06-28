package com.clinica_veterinaria.service;

import com.clinica_veterinaria.dao.ConsultaDAO;
import com.clinica_veterinaria.model.Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaDAO consultaDAO;

    public Consulta agendarConsulta(Consulta consulta) {
        return consultaDAO.salvar(consulta);
    }
}
