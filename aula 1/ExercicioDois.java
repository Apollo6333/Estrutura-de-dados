// André Luiz de Souza Nunes

import java.util.Scanner;

public class ExercicioDois {

    static String pessoas[] = new String[10];

    private static void Cadastro(Scanner input) {
        System.out.print("Digite o nome: ");
        String nome = input.next();

        int posicaoVazia = buscarPosicaoVazia();
        if (posicaoVazia != -1) {
            pessoas[posicaoVazia] = nome;
            System.out.println("Nome cadastrado com sucesso!");
        } else {
            System.out.println("Erro: Array lotado!");
        }
    }

    private static void listarNomes() {
        System.out.println("\n--- Lista de Nomes ---");
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                System.out.println((i + 1) + ". " + pessoas[i]);
            }
        }
    }

    private static int buscarPosicaoVazia() {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private static void alterarNome(Scanner input) {
        System.out.print("Digite o número do nome a ser alterado: ");
        int numeroNome = input.nextInt();

        int posicaoNome = numeroNome - 1;

        if (posicaoNome >= 0 && posicaoNome < pessoas.length && pessoas[posicaoNome] != null) {
            System.out.print("Digite o novo nome: ");
            String novoNome = input.next();
            pessoas[posicaoNome] = novoNome;
            System.out.println("Nome alterado com sucesso!");
        } else {
            System.out.println("Erro: Nome não encontrado!");
        }
    }

    private static void removerNome(Scanner input) {
        System.out.print("Digite o número do nome a ser removido: ");
        int numeroNome = input.nextInt();

        int posicaoNome = numeroNome - 1;
        if (posicaoNome >= 0 && posicaoNome < pessoas.length && pessoas[posicaoNome] != null) {
            pessoas[posicaoNome] = null;
            System.out.println("Nome removido com sucesso!");
        } else {
            System.out.println("Erro: Nome não encontrado!");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int resposta = 1;

        while(resposta != 5) {

        System.out.println("Selecione a operação que desejas realizar agora: \n1- Cadastrar: \n2- Listar todos os nomes: \n3- Alterar: \n4- Remover: \n5- Finalizar: ");
        
        try {
            resposta = input.nextInt();
        } catch (Exception e) {
            throw new IllegalArgumentException("Resposta deve ser um número");
        }
        
        switch (resposta) {
            case 1:
                Cadastro(input);
                break;
        
            case 2:
                listarNomes();
                break;

            case 3:
                alterarNome(input);
                break;

            case 4:
                removerNome(input);
                break;

            case 5:
                System.out.println("Tenha um bom dia/tarde/noite!");
                input.close();
                break;

            default:
                System.out.println("Opção invalida");
                break;
        }   
    }
    }
}
