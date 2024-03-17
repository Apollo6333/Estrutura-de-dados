import java.util.ArrayList;
import java.util.Scanner;

class GerenciadorRegistros {
    ArrayList<A2E2Pessoas> registros;

    GerenciadorRegistros() {
        registros = new ArrayList<>();
    }

    void cadastrar(String nome, int idade) {
        for (A2E2Pessoas registro : registros) {
            if (registro.getNome().equals(nome)) {
                System.out.println("Erro: Registro já existe.");
                return;
            }
        }
        registros.add(new A2E2Pessoas(nome, idade));
        System.out.println("Registro cadastrado com sucesso.");
    }

    void selecionarTodos() {
        if (registros.isEmpty()) {
            System.out.println("Não há registros.");
        } else {
            for (A2E2Pessoas registro : registros) {
                System.out.println("Nome: " + registro.getNome() + " Idade: " + registro.getNome());
            }
        }
    }

    void pesquisar(String termo) {
        boolean encontrado = false;
        for (A2E2Pessoas registro : registros) {
            if (registro.getNome().toLowerCase().contains(termo.toLowerCase())) {
                System.out.println("Nome: " + registro.getNome() + " Idade: " + registro.getNome());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum registro encontrado com o termo " + termo);
        }
    }

    void alterar(String nomeAntigo, String novoNome, int novaIdade) {
        for (A2E2Pessoas registro : registros) {
            if (registro.getNome().equals(nomeAntigo)) {
                registro.setNome(novoNome);
                registro.setIdade(novaIdade);
                System.out.println("Registro alterado com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Registro não encontrado.");
    }

    void remover(String nome) {
        for (A2E2Pessoas registro : registros) {
            if (registro.getNome().equals(nome)) {
                registros.remove(registro);
                System.out.println("Registro removido com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Registro não encontrado.");
    }
}

public class A2ExercicioDois {
    public static void main(String[] args) {
        GerenciadorRegistros gerenciador = new GerenciadorRegistros();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Cadastrar");
            System.out.println("2. Selecionar todos");
            System.out.println("3. Pesquisar");
            System.out.println("4. Alterar");
            System.out.println("5. Remover");
            System.out.println("6. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.next();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    gerenciador.cadastrar(nome, idade);
                    break;
                case 2:
                    gerenciador.selecionarTodos();
                    break;
                case 3:
                    System.out.print("Termo de pesquisa: ");
                    String termo = scanner.next();
                    gerenciador.pesquisar(termo);
                    break;
                case 4:
                    System.out.print("Nome do registro a ser alterado: ");
                    String nomeAntigo = scanner.next();
                    System.out.print("Novo nome: ");
                    String novoNome = scanner.next();
                    System.out.print("Nova idade: ");
                    int novaIdade = scanner.nextInt();
                    gerenciador.alterar(nomeAntigo, novoNome, novaIdade);
                    break;
                case 5:
                    System.out.print("Nome do registro a ser removido: ");
                    String nomeRemover = scanner.next();
                    gerenciador.remover(nomeRemover);
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
}
