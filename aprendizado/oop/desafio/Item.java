package desafio;

public class Item {
    int quantidade;
    Produto prod = new Produto();

    Item(String nome, double preco, int quantidade){
        prod.nome = nome;
        prod.preco = preco;
        this.quantidade = quantidade;
    }

    double obterValorItem(){
        return quantidade * prod.preco;
    }
}
