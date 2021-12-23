import java.util.LinkedList;

public class ListaLinkada {
    public static void main(String[] args) {
        LinkedList<Double> notas = new LinkedList<>();
        notas.add(7.8);
        notas.add(6.9);
        notas.add(9.8);
        notas.add(10.0);
        notas.add(8.6);

        for(int i = 0; i < notas.size(); i++){
            System.out.println("Nota "+(i+1)+": "+notas.get(i));
        }
        double sum = 0;
        for(Double b: notas){
            sum += b;
        }
        System.out.println("Média: "+(sum/notas.size()));
    }
}
