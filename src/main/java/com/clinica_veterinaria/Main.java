package application;

import application.model.ScannerSingleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = ScannerSingleton.getInstance();

        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Agendar Consulta");
            System.out.println("2 - Realizar Consulta");
            System.out.print("Opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida! Digite 1 para Agendar ou 2 para Realizar Consulta.");
                scanner.next();
            }
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao != 1 && opcao != 2) {
                System.out.println("Opção inválida! Tente novamente.\n");
            }
        } while (opcao != 1 && opcao != 2);

        if (opcao == 1) {
            application.Animal animal = null;
            int temDono;

            do {
                System.out.print("\nO animal tem dono? (1 - Sim / 2 - Não): ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Opção inválida! Digite 1 tem Sim ou 2 para Não.");
                    scanner.next();
                }
                temDono = scanner.nextInt();
                scanner.nextLine();

                if (temDono == 1) {
                    System.out.println("\nCadastro do Dono");
                    application.Dono dono = new application.Dono(scanner);
                    animal = application.Animal.criarAnimal(scanner, dono);
                } else if (temDono == 2) {
                    animal = application.Animal.criarAnimal(scanner, null);
                } else {
                    System.out.println("Opção inválida! Tente novamente.");
                }

            } while (temDono != 1 && temDono != 2);

            System.out.println("\nCadastro do Veterinário");
            application.Veterinario veterinario = new application.Veterinario(scanner);

            System.out.println("\nAgendamento de Consulta");
            application.Consulta consulta = new application.Consulta(scanner, animal, veterinario);
            consulta.agendarConsulta();

        } else if (opcao == 2) {
            System.out.println("\nCadastro do Veterinário");
            application.Veterinario veterinario = new application.Veterinario(scanner);

            System.out.println("\nCadastro do Animal");
            application.Animal animal = application.Animal.criarAnimal(scanner, null);

            System.out.println("\nDiagnóstico");
            application.Diagnostico diagnostico = new application.Diagnostico(scanner);

            application.Prescricao prescricao = null;
            int precisaMedicamento;

            do {
                System.out.print("\nO animal precisa de medicamento? (1 - Sim, 2 - Não): ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Opção inválida! Digite 1 para Sim ou 2 para Não.");
                    scanner.next();
                }
                precisaMedicamento = scanner.nextInt();
                scanner.nextLine();

                if (precisaMedicamento == 1) {
                    System.out.println("\nPrescrição de Medicamento");
                    prescricao = new application.Prescricao(scanner);
                } else if (precisaMedicamento != 2) {
                    System.out.println("Opção inválida! Tente novamente.");
                }

            } while (precisaMedicamento != 1 && precisaMedicamento != 2);

            System.out.println("\nResumo da Consulta:");
            diagnostico.exibirDiagnostico();
            if (prescricao != null) {
                prescricao.exibirPrescricao();
            } else {
                System.out.println("Nenhum medicamento foi prescrito.");
            }
        }

        scanner.close();
    }
}
