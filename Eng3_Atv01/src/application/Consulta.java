package application;

import java.util.Scanner;

public class Consulta implements Atendimento {
    private Animal animal;
    private Veterinario veterinario;
    private String data;

    public Consulta(Scanner scanner, Animal animal, Veterinario veterinario) {
        this.animal = animal;
        this.veterinario = veterinario;
        System.out.print("Data da consulta (dd/mm/aaaa): ");
        this.data = scanner.nextLine();
    }

    @Override
    public void agendarConsulta() {
        System.out.println("\nConsulta agendada para o animal " + animal.nomeAnimal + " com o veterinário " + veterinario + " na data " + data);
    }
}

