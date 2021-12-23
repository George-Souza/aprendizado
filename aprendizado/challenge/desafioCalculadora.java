import java.util.Scanner;

public class desafioCalculadora{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois números: ");

        int n1 = entrada.nextInt();

        int n2 = entrada.nextInt();

        System.out.println("Digite a operação que deseja realizar: ");
        System.out.println("1 - Soma");
        int r1 = n1 + n2;
        System.out.println("2 - Subtração");
        int r2 = n1 - n2;
        System.out.println("3 - Multiplicação");
        int r3 = n1 * n2;
        System.out.println("4 - Divisão");
        int r4 = n1/n2;
        int op = entrada.nextInt();
        
        if(op == 1){
            System.out.println(r1);
        }
        if(op == 2){
            System.out.println(r2);
        }
        if(op == 3){
            System.out.println(r3);
        }
        if(op == 4){
            System.out.println(r4);
        }

        entrada.close();
    }
}