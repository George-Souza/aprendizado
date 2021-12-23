package desafioHeranca;

public class Carro {
    public int velocidadeAtual = 0;

    final int VELOCIDADE_MAXIMA;

    public Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
        if(velocidadeAtual >= 0){
            velocidadeAtual += 5;
        }

        if(velocidadeAtual + 5 == VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
    }

    public void desacelerar(){
       if(velocidadeAtual >= 5){
           velocidadeAtual -= 5;
        }
    }

    public String mostrarVAtual(){
        return velocidadeAtual + "Km/h";
    }
}
