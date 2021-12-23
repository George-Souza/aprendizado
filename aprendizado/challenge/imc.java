
import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu Peso(kg): ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua Altura(m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura*altura);

        System.out.printf("IMC = %.2f\n", imc);
        sc.close();
    }
}
