import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<Integer> conjunto = new HashSet<Integer>();

        conjunto.add(23);
        conjunto.add(12);
        conjunto.add(35);

        System.out.println(conjunto.size());

        conjunto.remove(12);

        System.out.println(conjunto.size());

        HashSet<Integer> conj = new HashSet<Integer>();

        conj.add(24);
        conj.add(34);
        conj.add(26);
    

        System.out.println(conj);
        System.out.println(conjunto);

        conjunto.addAll(conj);

        System.out.println(conjunto);
    }
}
