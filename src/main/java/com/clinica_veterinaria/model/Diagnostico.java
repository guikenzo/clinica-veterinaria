package com.clinica_veterinaria.model;

import java.util.Scanner;

public class Diagnostico {
    private String descricao;

    public Diagnostico(Scanner scanner) {
        System.out.print("Digite o diagnóstico: ");
        this.descricao = scanner.nextLine();
    }

    public void exibirDiagnostico() {
        System.out.println("Diagnóstico: " + descricao);
    }
}
