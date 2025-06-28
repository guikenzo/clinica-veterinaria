package com.clinica_veterinaria.repository;

import com.clinica_veterinaria.model.Dono;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonoRepository extends MongoRepository<Dono, String> {
}
