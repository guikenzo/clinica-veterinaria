package application;

import java.util.Scanner;

public class Endereco {
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(Scanner scanner) {
        System.out.print("CEP: ");
        this.cep = scanner.nextLine();
        
        System.out.print("Logradouro: ");
        this.logradouro = scanner.nextLine();
        
        System.out.print("Bairro: ");
        this.bairro = scanner.nextLine();
        
        System.out.print("Cidade: ");
        this.cidade = scanner.nextLine();
        
        System.out.print("Estado: ");
        this.estado = scanner.nextLine();
        
        System.out.print("País: ");
        this.pais = scanner.nextLine();
    }
}
