package desafioHeranca;

public class Palio extends Carro{

    public Palio(int velocidadeMaxima){
        super(velocidadeMaxima);
    }
    public void acelerar(){
        super.acelerar();
        super.acelerar();
    }

    public void desacelerar(){
        super.desacelerar();
        super.desacelerar();
    }
}
