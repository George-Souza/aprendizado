public class ArvoreBinaria<T> {

    // declaração do nó que representa a raíz da árvore

    BinaryNode<T> raiz;

    // declaração do construtor

    public ArvoreBinaria(){

        // quando uma árvore é criada, ela inicialmente aponta para null

        raiz = null;
    }


    // modificador private, pode ser acessado somente dentro desta classe
    // método(ou função) que serve para inserir um novo nó na árvore
    // passado um nó(a raíz) e um valor, são feitas as verificações

    private BinaryNode<T> inserir(BinaryNode<T> node, T valor){

        // se o nó for null, então cria-se um novo nó
        // onde o valor que quero adicionar é colocado

        if(node == null){
            return new BinaryNode<>(valor);
        }

        // caso o valor que quero adicionar seja menor que o valor do nó em que estou comparando
        // então eu começo a formar a minha sub-árvore à esquerda
        // aqui eu faço um casting(mudança de tipo) para garantir que vai ser uma comparação dos valores int

        if((int) valor < (int) node.valor){
            node.noEsquerda = inserir(node.noEsquerda, valor);
        }

        //caso o valor seja maior do que o que está no meu nó
        // começo a formar minha árvore à direita

        else if((int) valor > (int) node.valor){
            node.noDireita = inserir(node.noDireita, valor);
        }

        // caso contrário, eu retorno o próprio nó, visto que o valor já existe

        else{
            return node;
        }
        return node;
    }

    // método public, este será visto pelo usuário quando ele quiser adicionar um novo valor

    public void add(T valor){

        // chama a funçao inserir para adicionar um novo nó à árvore

        raiz = inserir(raiz, valor);
    }



    // método para contar o número de nós
    // partindo do nó raíz, vou chamando a função recursivamente passando pelos nós a esquerda e direita
    // parando quando encontrar null em ambas as sub-árvores

    private int count(BinaryNode<T> no){
        if(no == null) return 0;
        return 1 + count(no.noEsquerda) + count(no.noDireita);
    }

    //método public, será chamado pelo usuário quando este quiser saber o número de nós

    public int contar(){

        // chama a função privada count

        return count(raiz);
    }


    // método para atravessar a árvore
    // o método começa chamando a si mesmo descendo pela árvore à esquerda até chegar no último valor
    // chegando lá, começa a printar os valores, subindo até a raíz
    // após isso, começa a printar a árvore à direita

    private void traverseInOrder(BinaryNode<T> no){
        if(no != null){
            traverseInOrder(no.noEsquerda);
            System.out.print(" " + no.valor);
            traverseInOrder(no.noDireita);
        }
    }

    // método para printar
    // o usuário utiliza esse método para printar a árvore

    public void printInOrder(){
        traverseInOrder(raiz);
    } 


    // outra forma de atravessar uma árvore é printando a partir da raíz
    // printando toda a árvore à esquerda
    // e no fim printando a árvore à direita

    private void traversePreOrder(BinaryNode<T> no){
        if(no != null){
            System.out.print(" " + no.valor);
            traversePreOrder(no.noEsquerda);
            traversePreOrder(no.noDireita);
        }
    }

    // método usado pelo usuário para printar em PreOrder

    public void printPreOrder(){
        traversePreOrder(raiz);
    }


    // outra forma de imprimir é chamando o postOrder
    // onde será printada a árvore à esquerda
    // depois a àrvore à direita
    // e por fim, a raíz

    private void traversePostOrder(BinaryNode<T> no){
        if(no != null){
            traversePostOrder(no.noEsquerda);
            traversePostOrder(no.noDireita);
            System.out.print(" " + no.valor);
        }
    }

    // método para public para chamar a função traversePostOrder
    
    public void printPostOrder(){
        traversePostOrder(raiz);
    }

    private boolean BSTcheck(BinaryNode<T> no){
        if(no == null) return true;

        if(no.noEsquerda != null && (int) no.noEsquerda.valor > (int) no.valor){
            return false;
        }
        if(no.noDireita != null && (int) no.noDireita.valor < (int) no.valor){
            return false;
        }
        if(!BSTcheck(no.noEsquerda) || !BSTcheck(no.noDireita)){
            return false;
        }

        return true;
    }

    public boolean checkBST(){
        return BSTcheck(raiz);
    }
}
