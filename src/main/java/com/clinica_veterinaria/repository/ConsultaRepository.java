package com.clinica_veterinaria.repository;

import com.clinica_veterinaria.model.Consulta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends MongoRepository<Consulta, String> {
}
