
import java.util.Scanner;

public class F_Celcius{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura: ");
        double temp_F = entrada.nextDouble();
        double temp_C = (temp_F - 32) / 1.8;
        System.out.printf("Temperatura em Celcius: %.2f°C\n", temp_C);
        entrada.close();
    }
}