package application;

import java.util.Scanner;

public class Dono {
    private String nome;
    private String telefone;
    private String cpf;
    private Endereco endereco;

    public Dono(Scanner scanner) {
        System.out.print("Nome do dono: ");
        this.nome = scanner.nextLine();
        
        System.out.print("Telefone: ");
        this.telefone = scanner.nextLine();
        
        System.out.print("CPF: ");
        this.cpf = scanner.nextLine();
        
        System.out.println("\nEndereço do dono");
        System.out.print("Deseja informar o logradouro? (1 - Sim, 2 - Não): ");
        boolean temLogradouro = scanner.nextInt() == 1;
        scanner.nextLine();
        this.endereco = Endereco.criarEndereco(scanner, temLogradouro);
    }
}
