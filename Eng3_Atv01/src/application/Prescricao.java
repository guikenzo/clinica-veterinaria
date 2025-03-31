package application;

import java.util.Scanner;

public class Prescricao {
    private String medicamento;
    private String dosagem;

    public Prescricao(Scanner scanner) {
        System.out.print("Nome do medicamento: ");
        this.medicamento = scanner.nextLine();
        System.out.print("Dosagem: ");
        this.dosagem = scanner.nextLine();
    }

    public void exibirPrescricao() {
        System.out.println("Prescrição: " + medicamento + " - " + dosagem);
    }
}
