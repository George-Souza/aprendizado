
import java.util.Scanner;

public class forDecrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 10; i >= 0; i -= 2){
            System.out.println("i = "+i);
        }
        sc.close();
    }
}
