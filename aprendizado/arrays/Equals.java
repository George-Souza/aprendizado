public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("João", 36);
        Usuario u2 = new Usuario("João", 36);

        System.out.println(u1.equals(u2));

    }
}
