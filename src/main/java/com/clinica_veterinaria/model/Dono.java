package com.clinica_veterinaria.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "donos")
public class Dono {

    @Id
    private String id;

    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;

    private String animalId;

    public Dono() {}

    // getters e setters

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getAnimalId() {
        return animalId;
    }
    public void setAnimalId(String animalId) {
        this.animalId = animalId;
    }
}
