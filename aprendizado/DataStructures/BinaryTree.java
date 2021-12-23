public class BinaryTree<T extends Comparable<T>> {
    private BinNo<T> raiz;

    public BinaryTree(){
        this.raiz = null;
    }

    public void add(T conteudo){
        raiz = inserir(raiz, conteudo);
    }

    private BinNo<T> inserir(BinNo<T> node, T conteudo){
        if(node == null){
            return new BinNo<>(conteudo);
        }
        else if(node.getConteudo().compareTo(conteudo) < 0){
            node.setNoEsq(inserir(node.getNoEsq(), conteudo));
        }
        else if(node.getConteudo().compareTo(conteudo) > 0){
            node.setNoDir(inserir(node.getNoDir(), conteudo));
        }
        return node;
    }

    public void inOrder(){
        System.out.println("Print In Order:\n");
        printInOrder(raiz);
        System.out.println();
    }

    private void printInOrder(BinNo<T> node){
        if(node != null){
            printInOrder(node.getNoEsq());
            System.out.print(node.getConteudo() + " ");
            printInOrder(node.getNoDir());
        }
    }

    public void postOrder(){
        System.out.println("Print Post Order:\n");
        printPostOrder(raiz);
        System.out.println();
    }

    private void printPostOrder(BinNo<T> node){
        if(node != null){
            printPostOrder(node.getNoEsq());
            printPostOrder(node.getNoDir());
            System.out.print(node.getConteudo() + " ");
        }
    }

    public void preOrder(){
        System.out.println("Print Pre Order:\n");
        printPreOrder(raiz);
        System.out.println();
    }

    private void printPreOrder(BinNo<T> node){
        if(node != null){
            System.out.print(node.getConteudo() + " ");
            printPreOrder(node.getNoEsq());
            printPreOrder(node.getNoDir());
        }
    }

    public void remover(T conteudo){
        try{
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while(atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;

                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsq();
                }else{
                    atual = atual.getNoDir();
                }
            }

            if(atual == null){
                System.out.println("Conteudo nao encontrado.");
            }

            if(pai == null){
                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }else if(atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                }else{
                    for(temp = atual, filho = atual.getNoEsq(); 
                    filho.getNoDir() != null; temp = filho, filho = filho.getNoEsq()){
                        if(filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }

            }else if(atual.getNoDir() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else{
                    pai.setNoDir(atual.getNoEsq());
                }
            }else if(atual.getNoEsq() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else{
                    pai.setNoDir(atual.getNoDir());
                }

            }else{
                for(temp = atual, filho = atual.getNoEsq();
                filho.getNoDir() != null; temp = filho, filho = filho.getNoDir()){
                    if(filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());

                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }
            }
        }catch(NullPointerException erro){
            System.out.println("Conteudo nao encontrado.");
        }
    }
}
