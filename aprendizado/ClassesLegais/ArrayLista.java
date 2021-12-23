import java.util.ArrayList;
import java.util.Collections;

public class ArrayLista {
    public static void main(String[] args) {
        ArrayList<String> listaAprovados = new ArrayList<>();
        listaAprovados.add("Joaquim");
        listaAprovados.add("Elizane");
        listaAprovados.add("Elessar");
        listaAprovados.add("Frodo");
        System.out.println(listaAprovados);
        System.out.println(listaAprovados.size());
        listaAprovados.remove(3);
        System.out.println(listaAprovados);
        System.out.println(listaAprovados.size());
        System.out.println(listaAprovados.get(0));
        System.out.println(listaAprovados.contains("Frodo"));
        System.out.println(listaAprovados.contains("Elessar"));
        System.out.println(listaAprovados.set(0, "Gandalf"));
        Collections.sort(listaAprovados);
        System.out.println(listaAprovados);
    }
}
