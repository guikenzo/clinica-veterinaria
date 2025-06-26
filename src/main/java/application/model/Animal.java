package application;

import java.util.Scanner;

public class Animal {
    protected String nomeAnimal;
    protected int idade;
    protected String raca;
    protected Dono dono;

    protected Animal(Builder builder) {
    	this.nomeAnimal = builder.nomeAnimal;
    	this.idade = builder.idade;
    	this.raca = builder.raca;
    	this.dono = builder.dono;
    }
    
    public static class Builder{
    	protected String nomeAnimal;
        protected int idade;
        protected String raca;
        protected Dono dono;
        
        public Builder nomeAnimal(String nomeAnimal) {
        	this.nomeAnimal = nomeAnimal;
        	return this;
        }
        
        public Builder idade(int idade) {
        	this.idade = idade;
        	return this;
        }
        
        public Builder raca(String raca) {
        	this.raca = raca;
        	return this;
        }
        
        public Builder dono(Dono dono) {
        	this.dono = dono;
        	return this;
        }
        
        public Animal build() {
        	return new Animal(this);
        }
    }
    
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
        while (true) {
            System.out.print("\nO animal é um (1) Cachorro ou (2) Gato? ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome do animal: ");
            String nomeAnimal = scanner.nextLine();

            System.out.print("Idade do animal: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Raça: ");
            String raca = scanner.nextLine();

            String tipo;
            if (escolha == 1) {
                tipo = "cachorro";
            } else if (escolha == 2) {
                tipo = "gato";
            } else {
                System.out.println("Opção inválida! Por favor, digite 1 para Cachorro ou 2 para Gato.");
                continue;
            }

            return AnimalFactory.criarAnimal(tipo, nomeAnimal, idade, raca, dono);
        }
    }
}
