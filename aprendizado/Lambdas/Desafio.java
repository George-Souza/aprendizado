import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Notebook";
        produto.preco = 2547.98;
        produto.desconto = 25;

        BinaryOperator<Double> precoComDesconto = (price, discount) -> {
            price = price - (price * (discount/100));
            return price;
        };

        UnaryOperator<Double> imposto = valor -> {
            if(valor >= 2500){
                valor = valor + (valor * (8.5/100));
                return valor;
            }
            else return valor;
        };

        UnaryOperator<Double> frete = valor -> {
            if(valor < 3000) return valor + 50;
            else return valor + 100;
        };

        UnaryOperator<Double> arredondar = valor -> Math.ceil(valor);

        Function<Double, String> formatada = valor -> "R$"+valor;

        String resultado = precoComDesconto
                    .andThen(imposto)
                    .andThen(frete)
                    .andThen(arredondar)
                    .andThen(formatada)
                    .apply(produto.preco, produto.desconto);

        System.out.println(resultado);


    }
}
