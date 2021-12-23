public class desafioAritmetico{
    public static void main(String[] args){
      int num1 = (6 * (3+2));
      int d1 = 6;
      int po1 = (int) Math.pow(num1, 2);
      int f1 = po1 / d1;

      int num2 = (-4) * (-5);
      int d2 = 2;
      int f = num2 / d2;
      int f2 = (int) Math.pow(f, 2);

      int N = f1 - f2;
      int po3 = (int) Math.pow(N, 3);

      int f3 = po3 / 1000;

        System.out.println(f3);
    }
}