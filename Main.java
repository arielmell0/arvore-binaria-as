public class main {
  public static void main(String[] args) {
    ArvoreBinaria arvore = new ArvoreBinaria();

    // Adicionando elementos à árvore
    arvore.adicionar(10);
    arvore.adicionar(5);
    arvore.adicionar(15);
    arvore.adicionar(3);
    arvore.adicionar(7);
    arvore.adicionar(12);
    arvore.adicionar(20);

    // Realizando um percurso na árvore
    arvore.percorrer();

    // Exibindo a árvore
    arvore.mostrarArvore();
  }
}
