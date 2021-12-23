import java.lang.Math;
import java.util.Scanner;

public class square_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        double valor = sc.nextDouble();
        
        double square = Math.pow(valor, 2);
        double cube = Math.pow(valor, 3);

        System.out.printf("Quadrado do valor: %.0f\n", square);
        System.out.printf("Cubo do valor: %.0f\n", cube);


        sc.close();
    }
}
