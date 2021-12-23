public class No<E> {
    private E valor;
    private No<E> proximo;
    
    public No(E valor, No<E> proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public No(E valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public No() {
        this.proximo = null;
    }

    public E getValor() {
        return valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public No<E> getProximo() {
        return proximo;
    }

    public void setProximo(No<E> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No [valor=" + valor + "]";
    }
}
