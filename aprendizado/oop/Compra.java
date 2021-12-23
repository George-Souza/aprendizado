import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> intens = new ArrayList<>();

    double obterValorFinal(){
        double total = 0;

        for(Item iten: intens){
            total += iten.quantidade * iten.preco;
        }

        return total;
    }
}
