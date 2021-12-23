import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Jon", "Mar", "Gui", "Bia", "Gue");

        System.out.println("Usando ForEach e Lambda:");
        aprovados.forEach(v -> System.out.println(v));

        System.out.println("\nUsando Iterator:");
        Iterator<String> it = aprovados.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\nUsando Stream:");

        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);
    }
}
