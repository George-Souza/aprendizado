import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        
        Consumer<String> co = valor -> System.out.println(valor);

        String frase = "Eu amo programar";
        co.accept(frase);

        List<String> nomes = Arrays.asList("João", "Maria", "Joaquim", "Alexa");

        nomes.forEach(co);

        
        
    }
}
