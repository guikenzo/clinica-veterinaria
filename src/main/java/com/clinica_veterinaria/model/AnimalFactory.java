package com.clinica_veterinaria.model;

public class AnimalFactory {

    public static Animal criarAnimal(String tipo, String nome, int idade, String raca, Dono dono) {
        switch (tipo.toLowerCase()) {
            case "cachorro":
                return new Cachorro.Builder()
                        .nomeAnimal(nome)
                        .idade(idade)
                        .raca(raca)
                        .dono(dono)
                        .build();
            case "gato":
                return new Gato.Builder()
                        .nomeAnimal(nome)
                        .idade(idade)
                        .raca(raca)
                        .dono(dono)
                        .build();
            default:
                throw new IllegalArgumentException("Tipo de animal inválido: " + tipo);
        }
    }
}
