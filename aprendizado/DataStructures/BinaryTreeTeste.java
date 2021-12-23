public class BinaryTreeTeste {
    public static void main(String[] args) {
        BinaryTree<Double> myTree = new BinaryTree<>();

        myTree.add(5.7);
        myTree.add(1.0);
        myTree.add(4.9);
        myTree.add(8.8);
        myTree.add(9.3);
        myTree.add(2.1);
        myTree.add(7.6);
        myTree.add(3.5);

        myTree.inOrder();
        myTree.preOrder();
        myTree.postOrder();

        myTree.remover(8.8);

        myTree.inOrder();
    }
}
