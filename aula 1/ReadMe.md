a) O que é estrutura de dados?

Estrutura de dados é uma maneira de organizar, gerenciar e armazenar dados de modo a permitir o acesso eficiente e a manipulação eficaz desses dados.

b) Qual sua importância?

otimizar o tempo de execução e o uso de memória para operações comuns, como inserção, busca, remoção e atualização de dados.

c) Explique e exemplifique as estruturas: array (estático e dinâmico), lista, fila e pilha.

Array estático: Armazena um conjunto de elementos do mesmo tipo, com o tamanho fixo definido na criação.
exemplo:

public class Exemplo {
   int[] numeros = new int[5]; // Array estático com 5 inteiros
   numeros[0] = 1; // Acessa a primeira posição e atribui valor 1
}

Array dinâmico: Armazena um conjunto de elementos do mesmo tipo, com o tamanho podendo ser manipulado dinamicamente com o uso de métodos.
exemplo:

public class Exemplo {
   int[] numeros;

   public Exemplo {
   this.numeros = new int[10];
   }
}

Lista: Armazena um conjunto de elementos do mesmo tipo, ordenados com base no índice dos elementos, podendo selecionar um elemento diretamente pelo índice, sem precisar alterar ou remover elementos.
exemplo:

public class Exemplo {
  LinkedList<Integer> lista = new LinkedList<>(); // Lista encadeada de inteiros
  lista.add(10);
  lista.addFirst(5); // Adicionando elementos no início
  lista.removeLast(); // Removendo elementos do final
  int elemento = lista.get(1); // Acessando elemento por posição
}

Fila: Armazena um conjunto de elementos do mesmo tipo, trabalha com o principio que o primeiro que entrou, será o primeiro a sair
exemplo:

public class Exemplo {
  Queue<Pessoa> filaAtendimento = new LinkedList<>(); // Fila de atendimento
  filaAtendimento.add(new Pessoa("Ana")); // Adicionando pessoas à fila
  filaAtendimento.poll(); // Atendendo a próxima pessoa
  Pessoa proxima = filaAtendimento.peek(); // Visualizando a próxima pessoa sem removê-la

}

Pilha: Armazena um conjunto de elementos do mesmo tipo, trabalha com o principio que o ultimo que entrou, será o primeiro a sair
exemplo:

public class Exemplo {
  Stack<Livro> pilhaLivros = new Stack<>(); // Pilha de livros
  pilhaLivros.push(new Livro("Java")); // Adicionando livros à pilha
  pilhaLivros.pop(); // Removendo livros da pilha
  Livro ultimoLivro = pilhaLivros.peek(); // Visualizando o último livro sem removê-lo
}
