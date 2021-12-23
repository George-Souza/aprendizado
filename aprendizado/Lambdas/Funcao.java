import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        
        Function<Integer, String> parOuImpar = v -> {
            if(v%2 == 0) return "É par";
            else return "É impar";
        };

        System.out.println(parOuImpar.apply(2)); 
    }
}
