public class DLList<T> {
    private NoDuplo<T> head;
    private NoDuplo<T> tail;
    private int tamLista;

    public DLList(){
        this.tamLista = 0;
    }

    public int size(){
        return tamLista;
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> novo = head;

        for(int i = 0; (i < index) && (novo != null); i++){
            novo = novo.getProximo();
        }

        return novo;
    }

    public T get(int index){
        return getNo(index).getValor();
    }

    public void add(T elemento){
        NoDuplo<T> novo = new NoDuplo<>(elemento);
        novo.setProximo(null);
        novo.setAnterior(tail);

        if(head == null){
            head = novo;
        }
        if(tail != null){
            tail.setProximo(novo);
        }

        tail = novo;
        tamLista++;
    }

    public void addAt(T elemento, int index){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novo = new NoDuplo<>(elemento);

        novo.setProximo(noAuxiliar);

        if(novo.getProximo() != null){
            novo.setAnterior(noAuxiliar.getAnterior());
            novo.getProximo().setAnterior(novo);
        }
        else{
            novo.setAnterior(tail);
            tail = novo;
        }
        
        if(index == 0){
            head = novo;
        }
        else{
            novo.getAnterior().setProximo(novo);
        }
        tamLista++;
    }

    public void remover(int index){
        if(index == 0){
            head = head.getProximo();
            if(head != null){
                head.setAnterior(null);
            }
        }
        else{
            NoDuplo<T> auxiliar = getNo(index);

            auxiliar.getAnterior().setProximo(auxiliar.getProximo());

            if(auxiliar != tail){
                auxiliar.getProximo().setAnterior(auxiliar.getAnterior());
            }
            else{
                tail = auxiliar;
            }
        }
        tamLista--;
    }

    public String toString(){
        String retorno = "";
        NoDuplo<T> auxiliar = head;

        if(tamLista == 0){
            retorno = "[]";
        }
        else{
            for(int i = 0; i < tamLista; i++){
                retorno += auxiliar.getValor() + ", ";
                auxiliar = auxiliar.getProximo();
            }

            retorno = "[" + retorno.substring(0, retorno.length()-2) + "]";
        }
        
        return retorno;
    }
}
