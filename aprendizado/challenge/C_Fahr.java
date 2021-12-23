import java.util.Scanner;

public class C_Fahr {
    public static void main(String[] args) {
        Numeros n = new Numeros();
        System.out.println(n.fat(5));
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a Temperatura: ");
        double temp_C = entrada.nextDouble();
        double temp_F = (temp_C * 1.8) + 32;

        System.out.printf("Temperatura em Fahrenheit: %.2f°F\n", temp_F);
        entrada.close();
    }
}
