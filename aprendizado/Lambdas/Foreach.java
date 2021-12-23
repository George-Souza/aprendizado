import java.util.ArrayList;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        
        List<String> aprovados = new ArrayList<>();

        aprovados.add("Bia");

        aprovados.add("Lia");

        aprovados.add("Gui");

        aprovados.add("Ana");

        System.out.println("Forma tradicional de print:");

        for(String nome: aprovados){
            
            System.out.println(nome);

        }

        System.out.println("\nLambda #1:");

        aprovados.forEach((nome) -> {System.out.println(nome + "!!");});

        System.out.println("\nMethod Reference:");

        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #2:");

        aprovados.forEach(nome -> printNome(nome));
    }

    static void printNome(String nome){
        System.out.println("Oi, meu nome é "+nome);
    }
}
