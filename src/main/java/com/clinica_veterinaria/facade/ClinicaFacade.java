package com.clinica_veterinaria.facade;

import com.clinica_veterinaria.model.Animal;
import com.clinica_veterinaria.model.Consulta;
import com.clinica_veterinaria.model.Dono;
import com.clinica_veterinaria.service.AnimalService;
import com.clinica_veterinaria.service.ConsultaService;
import com.clinica_veterinaria.service.DonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClinicaFacade {

    @Autowired
    private AnimalService animalService;

    @Autowired
    private DonoService donoService;

    @Autowired
    private ConsultaService consultaService;

    public Animal salvarAnimal(Animal animal) {
        return animalService.salvar(animal);
    }

    public List<Animal> listarAnimais() {
        return animalService.listarTodos();
    }

    public Dono salvarDono(Dono dono) {
        return donoService.salvar(dono);
    }

    public Consulta salvarConsulta(Consulta consulta) {
        return consultaService.salvar(consulta);
    }

}
