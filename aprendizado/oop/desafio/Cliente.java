package desafio;

import java.util.ArrayList;

public class Cliente {
    String nome;

    ArrayList<Compra> buy = new ArrayList<>();
    
    double fim = 0;

    Cliente(String nomeCliente, String nomeProduto, double preco, int quantidade){
        this.nome = nomeCliente;
        buy.add(new Compra(nome, preco, quantidade));
    }

    double valorFinal(){
        for(Compra by: buy){
            fim += by.obterValorCompra();
        }
        return fim;
    }
}
