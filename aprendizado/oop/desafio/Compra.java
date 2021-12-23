package desafio;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> iten = new ArrayList<>();
    
    double total = 0;
    Compra(String nome, double preco, int quantidade){
        iten.add(new Item(nome, preco, quantidade));
    }
    double obterValorCompra(){
        for(Item it: iten){
            total += it.obterValorItem();
        }

        return total;
    }
}
