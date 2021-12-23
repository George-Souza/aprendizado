public class MetodosEstaticos {
    static int fatorial(int n){
        if(n == 1 || n == 0) return 1;
        else return n * fatorial(n-1);
    }

    static boolean isPrimo(int n, int d){
        if(n == d) return true;
        else if(n%d == 0) return false;
        return isPrimo(n, d+1);
    }
    public static void main(String[] args) {
        System.out.println(fatorial(3));
        System.out.println(isPrimo(3, 2));
    }
}
