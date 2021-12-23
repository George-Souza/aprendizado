public class Produto {
    String nome;
    double preco;
    double desconto = 25;

    double calcDesconto(){
        desconto = preco * desconto;
        preco -= desconto;
        return preco;
    } 
}
