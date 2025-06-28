package com.clinica_veterinaria.repository;

import com.clinica_veterinaria.model.ConexaoTeste;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConexaoTesteRepository extends MongoRepository<ConexaoTeste, String> {}
