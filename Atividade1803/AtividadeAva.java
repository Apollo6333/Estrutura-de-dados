// André Luiz de Souza Nunes

package Atividade1803;

import java.util.LinkedList;
import java.util.Scanner;

public class AtividadeAva {

    private static final Scanner scanner = new Scanner(System.in);
    private static LinkedList<String> listaAtividades = new LinkedList<>();

    
    public static void main(String[] args) {
        
        int opcao;

        listaAtividades.add("Atender telefonemas");
        listaAtividades.add("Receber visitantes");
        listaAtividades.add("Registrar entregas");
        listaAtividades.add("Organizar documentos");
        listaAtividades.add("Agendar reuniões");

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarTarefa();
                    break;
                case 2:
                    conclusaoTarefa();
                    break;
                case 3:
                    checarTarefa();
                case 4:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }

    private static void exibirMenu() {
        System.out.println("\n--- Sistema de Atendimento ---");
        System.out.println("1. Cadastrar tarefa");
        System.out.println("2. Registrar tarefa completa");
        System.out.println("3. Checar qual a proxima tarefa");
        System.out.println("4. Finalizar");
        System.out.print("Digite a opção desejada: ");
    }

    private static void cadastrarTarefa() {
        System.out.print("Insira uma nova tarefa: ");
        String nome = scanner.next();

        listaAtividades.add(nome);
        System.out.println("Tarefa cadastrada com sucesso. Número de tarefas atual: " + listaAtividades.size());
    }

    private static void conclusaoTarefa() {
        if (!listaAtividades.isEmpty()) {
            String ultimaTarefa = listaAtividades.removeFirst();
            System.out.println("A tarefa: " + ultimaTarefa + " foi finalizada.");
        } else {
            System.out.println("Fila vazia!");
        }
    }

    private static void checarTarefa() {
        System.out.println("A próxima atividade na lista é: " + listaAtividades.peek());
    }
}
