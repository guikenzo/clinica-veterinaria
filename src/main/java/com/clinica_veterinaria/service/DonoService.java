package com.clinica_veterinaria.service;

import com.clinica_veterinaria.dao.DonoDAO;
import com.clinica_veterinaria.model.Dono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonoService {

    @Autowired
    private DonoDAO donoDAO;

    public Dono salvarDono(Dono dono) {
        return donoDAO.salvar(dono);
    }
}
