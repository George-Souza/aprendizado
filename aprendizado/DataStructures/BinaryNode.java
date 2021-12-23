
//public - modificador de acesso, permite que esta classe seja acessada por qualquer outra

//BinaryNode<T> - nome do meu "Tipo Abstrato", T é um genérico, significa que eu posso criar um nó de qualquer tipo
public class BinaryNode<T> {
    // valor armazenado no nó
    T valor;
    // referência ao nó à direita
    BinaryNode<T> noDireita;
    // referência ao nó à esquerda
    BinaryNode<T> noEsquerda;

    // construtor - é a declaração que me perimite criar uma variavel do tipo BinaryNode
    public BinaryNode(T valor) {
        this.valor = valor;
        this.noDireita = null;
        this.noEsquerda = null;
    }
}
