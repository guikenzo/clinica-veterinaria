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
        this.endereco = new Endereco(scanner);
    }
}
