
import java.util.Scanner;

public class divisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c;
        c = sc.nextInt();
        int i = 1;
        while(i <= c){
            if(c%i == 0){
                System.out.println(i);
            }
            i++;
        }
        sc.close();
    }
}
