// André Luiz de Souza Nunes

// Utilizei de fila, pois nunca havia usado filas antes, e o modelo F.I.F.O me deixou curioso sobre como funcionava,
// e quão eficiente seria esse método.

import java.util.LinkedList;
import java.util.Scanner;

public class ExercicioQuatro {

    private static final Scanner scanner = new Scanner(System.in);
    private static LinkedList<String> filaAtendimento = new LinkedList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarAtendimento();
                    break;
                case 2:
                    removerAtendimento();
                    break;
                case 3:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }

    private static void exibirMenu() {
        System.out.println("\n--- Sistema de Atendimento ---");
        System.out.println("1. Cadastrar Atendimento");
        System.out.println("2. Remover Atendimento");
        System.out.println("3. Finalizar");
        System.out.print("Digite a opção desejada: ");
    }

    private static void cadastrarAtendimento() {
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.next();

        filaAtendimento.add(nome);
        System.out.println("Atendimento cadastrado com sucesso! Posição na fila: " + filaAtendimento.size());
    }

    private static void removerAtendimento() {
        if (!filaAtendimento.isEmpty()) {
            String nomeAtendido = filaAtendimento.removeFirst();
            System.out.println("Atendimento de " + nomeAtendido + " realizado com sucesso!");
        } else {
            System.out.println("Fila vazia!");
        }
    }
}

