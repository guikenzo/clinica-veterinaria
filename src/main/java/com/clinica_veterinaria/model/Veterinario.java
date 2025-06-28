package com.clinica_veterinaria.model;

import java.util.Scanner;

public class Veterinario {
    private String nomeVet;
    private String crmv;

    public Veterinario(Scanner scanner) {
        System.out.print("Nome do veterinário: ");
        this.nomeVet = scanner.nextLine();
        System.out.print("CRMV: ");
        this.crmv = scanner.nextLine();
    }

    @Override
    public String toString() {
        return nomeVet + " (CRMV: " + crmv + ")";
    }
}