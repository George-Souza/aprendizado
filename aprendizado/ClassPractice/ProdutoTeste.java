public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.nome = "Celular";
        p1.preco = 1200;
        System.out.println(p1.calcDesconto());
    }
}
