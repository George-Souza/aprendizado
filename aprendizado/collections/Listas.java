import java.util.ArrayList;
public class Listas{
    public static void main(String[] args) {
        ArrayList<Usu> list = new ArrayList<>();
        list.add(new Usu("João"));
        list.add(new Usu("Maria"));
        list.add(new Usu("Carlos"));
        for(Usu n: list){
            System.out.println(n.nome);
        }
    }
}