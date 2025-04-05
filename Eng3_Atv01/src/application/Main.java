package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
            Animal animal = null;
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
                    Dono dono = new Dono(scanner);
                    animal = Animal.criarAnimal(scanner, dono);
                } else if (temDono == 2) {
                    animal = Animal.criarAnimal(scanner, null);
                } else {
                    System.out.println("Opção inválida! Tente novamente.");
                }

            } while (temDono != 1 && temDono != 2);

            System.out.println("\nCadastro do Veterinário");
            Veterinario veterinario = new Veterinario(scanner);

            System.out.println("\nAgendamento de Consulta");
            Consulta consulta = new Consulta(scanner, animal, veterinario);
            consulta.agendarConsulta();

        } else if (opcao == 2) {
            System.out.println("\nCadastro do Veterinário");
            Veterinario veterinario = new Veterinario(scanner);

            System.out.println("\nCadastro do Animal");
            Animal animal = Animal.criarAnimal(scanner, null);

            System.out.println("\nDiagnóstico");
            Diagnostico diagnostico = new Diagnostico(scanner);

            Prescricao prescricao = null;
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
                    prescricao = new Prescricao(scanner);
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
