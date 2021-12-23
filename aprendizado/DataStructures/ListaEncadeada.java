public class ListaEncadeada {
    public static void main(String[] args) {
        // SLList<Integer> l1 = new SLList<>();
        // l1.add(2);
        // l1.add(3);
        // l1.add(4);
        // l1.remove(0);
        // l1.add(12);
        // l1.add(34);
        // l1.remove(2);
        // System.out.println(l1);

        // DLList<Double> l2 = new DLList<>();

        // l2.add(1.0);
        // l2.add(1.5);
        // l2.addAt(0.5, 0);
        // l2.add(2.0);
        // l2.remover(0);
        // System.out.println(l2);

        ListaCircular<String> l3 = new ListaCircular<>();

        l3.add("e1");
        l3.add("e2");
        l3.add("e3");
        l3.add("e4");
        l3.remover(2);
        
        System.out.println(l3.get(25));
    }    
}
