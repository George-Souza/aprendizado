import java.util.Arrays;
import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de alunos: ");
        int qtdAlunos = sc.nextInt();

        System.out.println("Informe a quantidade de notas por aluno: ");
        int qtdNotas = sc.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double media = 0;
        for(int i = 0; i < notasDaTurma.length; i++){
            for(int j = 0; j < notasDaTurma[i].length; j++){
                System.out.printf("Nota %d do aluno %d: ", (j+1), (i+1));
                notasDaTurma[i][j] = sc.nextDouble();
                media += notasDaTurma[i][j];
            }
        }
        media /= (qtdAlunos*qtdNotas);
        
        for(double notas[]: notasDaTurma){
            System.out.println(Arrays.toString(notas));
        }

        System.out.printf("Média da turma: %.2f\n", media);
        sc.close();
    }
}
