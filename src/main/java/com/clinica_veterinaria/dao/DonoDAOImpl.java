package com.clinica_veterinaria.dao;

import com.clinica_veterinaria.model.Dono;
import com.clinica_veterinaria.repository.DonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DonoDAOImpl implements DonoDAO {

    @Autowired
    private DonoRepository donoRepository;

    @Override
    public Dono salvar(Dono dono) {
        return donoRepository.save(dono);
    }
}
