package application;

import java.util.Scanner;

public class Animal {
    protected String nomeAnimal;
    protected int idade;
    protected String raca;
    protected Dono dono;

    public Animal(Scanner scanner, Dono dono) {
        System.out.print("Nome do animal: ");
        this.nomeAnimal = scanner.nextLine();
        
        System.out.print("Idade do animal: ");
        this.idade = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Raça: ");
        this.raca = scanner.nextLine();
        this.dono = dono;
    }

    public static Animal criarAnimal(Scanner scanner, Dono dono) {
        int escolha;
        while (true) {
            System.out.print("\nO animal é um (1) Cachorro ou (2) Gato? ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                return new Cachorro(scanner, dono);
            } else if (escolha == 2) {
                return new Gato(scanner, dono);
            } else {
                System.out.println("Opção inválida! Por favor, digite 1 para Cachorro ou 2 para Gato.");
            }
        }
    }
}
