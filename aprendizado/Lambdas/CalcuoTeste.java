import java.util.function.BinaryOperator;

public class CalcuoTeste {
    public static void main(String[] args) {
        //Calculo sum = new Soma();
        //Calculo div = new Divisao();
        Calculo calc = (x, y) -> {return x + y;}; // função lambda
        System.out.println(calc.executar(3, 5));
        calc = (x, y) -> {return x / y; };
        System.out.println(calc.executar(4, 2));

        BinaryOperator<Double> cal = (x, y) -> x + y;
        System.out.println(cal.apply(3.0, 6.0));
    }
}
