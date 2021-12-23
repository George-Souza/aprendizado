import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("Assassin's Creed");
        pilha.push("Watch Dogs");
        pilha.push("Far Cry");

        System.out.println(pilha);

        pilha.pop();

        System.out.println(pilha);
    }
}
