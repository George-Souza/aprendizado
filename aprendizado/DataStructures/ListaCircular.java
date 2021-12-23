public class ListaCircular<T> {
    private No<T> head;
    private No<T> tail;
    private int tamLista;

    public ListaCircular(){
        this.tamLista = 0;
    }

    public int size(){
        return tamLista;
    }

    public boolean isEmpty(){
        return tamLista == 0;
    }

    private No<T> getNo(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException();
        
        if(index == 0){
            return head;
        }
        No<T> auxiliar = head;

        for(int i = 0; (i < index) && (auxiliar != null); i++){
            auxiliar = auxiliar.getProximo();
        }

        return auxiliar;
    }

    public T get(int index){
        return getNo(index).getValor();
    }

    public void remover(int index){
        if(index >= tamLista){
            throw new IndexOutOfBoundsException();
        }

        No<T> auxiliar = head;

        if(index == 0){
            head = head.getProximo();
            tail.setProximo(head);
        }
        else if(index == 1){
            head.setProximo(head.getProximo().getProximo());
        }
        else{
            for(int i = 0; i < index-1; i++){
                auxiliar = auxiliar.getProximo();
            }

            auxiliar.setProximo(auxiliar.getProximo().getProximo());
        }
        tamLista--;
    }

    public void add(T elemento){
        No<T> novo = new No<>(elemento);

        if(isEmpty()){
            head = novo;
            tail = head;
            tail.setProximo(head);
        }
        else{
            novo.setProximo(head);
            tail.setProximo(novo);
            head = novo;
        }
        tamLista++;
    }

    public String toString(){
        String strRetorno = "";
        if(isEmpty()){
            strRetorno = "[]";
        }
        else{
            No<T> auxiliar = head;

            for(int i = 0; i < tamLista; i++){
                strRetorno += auxiliar.getValor() + ", ";
                auxiliar = auxiliar.getProximo();
            }

            strRetorno = "[" + strRetorno.substring(0, strRetorno.length()-2) + "]";
        }
        return strRetorno;
    }
}
