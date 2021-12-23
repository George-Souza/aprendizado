import java.util.LinkedList;
import java.util.Queue;

public class Filas {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.offer("Jayne");
        fila.offer("Marshall");
        fila.offer("Ramón");
        fila.offer("Eduardo Elrik");

        System.out.println(fila);
        
        fila.poll();

        System.out.println(fila);
    }
}
