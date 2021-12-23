public class SLList<E>{
    private No<E> entradaReference;
    private int tamLista;
    
    public SLList(){
        this.entradaReference = null;
        this.tamLista = 0;
    }

    public boolean isEmpty(){
        return entradaReference == null ? true : false;
    }
    
    public int size(){
        return tamLista;
    }

    public void add(E elemento){
        No<E> novo = new No<>(elemento);

        if(this.isEmpty()){
            entradaReference = novo;
            tamLista++;
            return;
        }
        No<E> auxiliar = this.entradaReference;
        for(int i = 0; i < this.tamLista-1; i++){
            auxiliar = auxiliar.getProximo();
        }
        auxiliar.setProximo(novo);
        tamLista++;
    }

    private No<E> getNo(int index){

        if(index < tamLista && index >= 0){
            No<E> auxiliar = this.entradaReference;
            No<E> retorno = null;

            for(int i = 0; i <= index; i++){
                retorno = auxiliar;
                auxiliar = auxiliar.getProximo();
            }
            return retorno;
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }

    public E get(int index){
        return getNo(index).getValor();
    }

    public E remove(int index){
        No<E> alvo = this.getNo(index);

        if(index == 0){
            this.entradaReference = alvo.getProximo();
            tamLista--;
            return alvo.getValor();
        }

        No<E> anterior = getNo(index - 1);
        anterior.setProximo(alvo.getProximo());
        tamLista--;
        return alvo.getValor();
    }

    public String toString(){
        String retorno = "";
        No<E> auxiliar = entradaReference;
        if(isEmpty() == false){
           for(int i = 0; i < tamLista; i++){
                retorno += auxiliar.getValor() + ", ";
                auxiliar = auxiliar.getProximo();
           }
        }
        if(retorno == ""){
            retorno = "[]";
        }
        else{
            retorno = "[" + retorno.substring(0, retorno.length()-2) + "]";
        }
        return retorno;
    }

}