public class Carro {
    Motor mot1 = new Motor();

    void acelerar(){
        mot1.injecaoMotor += 0.5;
    }

    void frear(){
        mot1.injecaoMotor -= 0.5;
    }

    void ligar(){
        mot1.ligado = true;
    }

    void desligar(){
        mot1.ligado = false;
    }

    public boolean estaLigado(){
        return mot1.ligado;
    }
}
