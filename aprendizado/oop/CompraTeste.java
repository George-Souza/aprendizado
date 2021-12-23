public class CompraTeste {
    public static void main(String[] args) {
        Compra comp1 = new Compra();
        comp1.cliente = "Alexandre Magno";
        comp1.intens.add(new Item("Feijão", 2, 2.50)); 
        comp1.intens.add(new Item("Arroz", 5, 11.57));

        System.out.println(comp1.obterValorFinal());
    }
}
