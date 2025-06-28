package com.clinica_veterinaria.dao;

import com.clinica_veterinaria.model.Consulta;
import com.clinica_veterinaria.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ConsultaDAOImpl implements ConsultaDAO {

    @Autowired
    private ConsultaRepository consultaRepository;

    @Override
    public Consulta salvar(Consulta consulta) {
        return consultaRepository.save(consulta);
    }
}
