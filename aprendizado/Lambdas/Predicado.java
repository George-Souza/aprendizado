import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<String> isVerdade = st -> false; // predicate pega um dado qualquer e retorna um valor booleano

        System.out.println(isVerdade.test("Anything"));



    }
}
