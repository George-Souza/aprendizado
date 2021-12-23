import java.util.Scanner;

public class desafioConversao{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();

        String  j = sc.nextLine();

        String k = sc.nextLine();

        double m = Double.parseDouble(c);
        double n = Double.parseDouble(j);
        double o = Double.parseDouble(k);

        double media = (m+n+o)/3;

        System.out.printf("%.2f\n", media);
        sc.close();
    }
}