// André Luiz de Souza Nunes

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioTres {

    private static final Scanner scanner = new Scanner(System.in);
    private static ArrayList<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    pesquisarProduto();
                    break;
                case 4:
                    alterarProduto();
                    break;
                case 5:
                    removerProduto();
                    break;
                case 6:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
    }

    private static void exibirMenu() {
        System.out.println("\n--- Gerenciamento de Produtos ---");
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Listar Produtos");
        System.out.println("3. Pesquisar Produto");
        System.out.println("4. Alterar Produto");
        System.out.println("5. Remover Produto");
        System.out.println("6. Finalizar");
        System.out.print("Digite a opção desejada: ");
    }

    private static void cadastrarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.next();
        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        produtos.add(new Produto(nome, valor));
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void listarProdutos() {
        System.out.println("\n--- Lista de Produtos ---");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Valor: R$" + produto.getValor());
            System.out.println();
        }
    }

    private static void pesquisarProduto() {
        System.out.print("Digite o nome do produto: ");
        String termo = scanner.next();

        System.out.println("\n--- Resultados da Pesquisa ---");
        for (Produto produto : produtos) {
            if (produto.getNome().toLowerCase().contains(termo.toLowerCase())) {
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Valor: R$" + produto.getValor());
                System.out.println();
            }
        }
    }

    private static void alterarProduto() {
        System.out.print("Digite o nome do produto a ser alterado: ");
        String nome = scanner.next();

        int posicao = encontrarProduto(nome);
        if (posicao != -1) {
            System.out.print("Digite o novo nome do produto: ");
            String novoNome = scanner.next();
            System.out.print("Digite o novo valor do produto: ");
            double novoValor = scanner.nextDouble();

            produtos.get(posicao).setNome(novoNome);
            produtos.get(posicao).setValor(novoValor);
            System.out.println("Produto alterado com sucesso!");
        } else {
            System.out.println("Erro: Produto não encontrado!");
        }
    }

    private static void removerProduto() {
        System.out.print("Digite o nome do produto a ser removido: ");
        String nome = scanner.next();

        int posicao = encontrarProduto(nome);
        if (posicao != -1) {
            produtos.remove(posicao);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Erro: Produto não encontrado!");
        }
    }

    private static int encontrarProduto(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }
}
    
