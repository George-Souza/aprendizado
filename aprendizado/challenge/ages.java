import java.util.Scanner;

public class ages{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        double media;
        double c = 0;
        int i = 0;
        while (n > 0) {
            c += n;
            n = sc.nextInt();
            i++;
        }
        media = c / i;
        System.out.printf("%.2f\n", media);

        sc.close();
    }
}