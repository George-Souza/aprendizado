
import java.util.Scanner;

public class trig_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura do triangulo: ");
        double h = sc.nextDouble();
        System.out.println("Digite a base do triangulo: ");
        double b = sc.nextDouble();

        double a = (b * h) / 2;

        System.out.printf("Área do triangulo: %.0fcm^2", a);
        sc.close();
    }
}
