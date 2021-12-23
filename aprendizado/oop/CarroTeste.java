public class CarroTeste {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        System.out.println(car1.estaLigado());
        car1.ligar();
        System.out.println(car1.estaLigado());
        System.out.println(car1.mot1.injecaoMotor);
        car1.mot1.injecaoMotor = 2;
        System.out.println(car1.mot1.injecaoMotor);
        System.out.println(car1.mot1.giro());
        car1.acelerar();
        car1.acelerar();
        car1.acelerar();
        System.out.println(car1.mot1.giro());
        
    }
}
