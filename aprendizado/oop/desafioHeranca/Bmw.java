package desafioHeranca;

public class Bmw extends Carro{

    public Bmw(int velocidadeMaxima){
        super(velocidadeMaxima);
    }
    public void acelerar(){
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }

    public void desacelerar(){
        super.desacelerar();
        super.desacelerar();
        super.desacelerar();
    }
}
