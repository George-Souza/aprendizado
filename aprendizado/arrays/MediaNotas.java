import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas notas deseja colocar? ");
        
        int t = sc.nextInt();
        
        double[] alunoNotas = new double[t];
        
        double media = 0;
        
        for(int i = 0; i < alunoNotas.length; i++){
            System.out.println("Digite a nota "+(i+1)+": ");
        
            alunoNotas[i] = sc.nextDouble();
        
            media += alunoNotas[i];
        }
        
        media /= alunoNotas.length;
        
        System.out.printf("Média: %.2f\n", media);
        
        sc.close();
    }
}
