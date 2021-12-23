package controle;
import java.util.Scanner;

public class se {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a nota:");
        double nota = sc.nextDouble();
        
        if(nota >= 6) System.out.println("Passou! Parabéns!!");
        else System.out.println("Que pena... Quem sabe na próxima");
        sc.close();
    }
}
