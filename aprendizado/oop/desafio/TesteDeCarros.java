package desafio;

import desafioHeranca.Bmw;
import desafioHeranca.Carro;
import desafioHeranca.Palio;

public class TesteDeCarros {
    public static void main(String[] args) {
        Carro c1 = new Palio(200);
        Carro c2 = new Bmw(300);
        Carro c3 = new Carro(100);
        

        c1.acelerar();
        c2.acelerar();
        c3.acelerar();

        System.out.printf("Carro1: %d\nCarro2: %d\nCarro3: %d\n", c1.velocidadeAtual, 
        c2.velocidadeAtual, c3.velocidadeAtual);

        // c1.desacelerar();

        System.out.println(c1.mostrarVAtual());
    }
}
