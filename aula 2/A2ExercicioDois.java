// package aula 2;

public class A2ExercicioDois {

    public void Cadastro() {
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

    public static void main(String[] args) {
        
    }
}
