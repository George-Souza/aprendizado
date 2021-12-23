package desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Joaquim", "Caneta", 0.5, 20);
        
        System.out.println("Olá "+cliente1.nome+" Você comprou R$"+cliente1.valorFinal());
    }
}
