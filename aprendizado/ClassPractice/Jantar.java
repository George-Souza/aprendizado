public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Julliene";
        p1.peso = 80.6;

        Comida food = new Comida();
        food.nome = "Lasanha";
        food.peso = 2;
        System.out.println(p1.nome + " Está comendo "+food.nome+" Ela tem "+p1.peso+"kg");
        p1.Comer(food);
        System.out.println(p1.nome + " agora tem "+p1.peso+"kg");
    }
}
