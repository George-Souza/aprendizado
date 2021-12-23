
import java.util.Scanner;

public class desafioWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int cont = 0;
        double nota = 0;
        while (nota != -1) {
            nota = sc.nextDouble();
            if(nota >= 0 && nota <= 10){
                sum += nota;
                cont++;
            }
        }

        System.out.printf("Média: %.2f\nAlunos: %d\n", sum/cont, cont);
        sc.close();
    }
}
