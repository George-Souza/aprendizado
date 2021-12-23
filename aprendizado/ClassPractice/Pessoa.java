public class Pessoa {
    double peso;
    String nome;

    void Comer(Comida comida){
        peso += comida.peso;
    }
}
