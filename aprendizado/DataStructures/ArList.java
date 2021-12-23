public class ArList<E> {
   private int tam_maximo = 15;
   private int tam_atual;
   Object[] lista;

   ArList(){
       this.tam_atual = 0;
        lista = new Object[tam_maximo];
    }

    public void adicionar(Object ob){
        lista[tam_atual++] = ob;
    }

    public int tamanho(){
        return tam_atual;
    }

    public void inserir(int posicao, Object ob){
        for(int i = tam_atual; i > posicao; i--){
            lista[i] = lista[i-1];
        }
        lista[posicao] = ob;
        tam_atual++;
    }

    public void inserirComeco(Object ob){
        for(int i = tam_atual; i > 0; i--){
            lista[i] = lista[i-1];
        }
        lista[0] = ob;
        tam_atual++;
    }

    public void remover(int posicao){
        lista[posicao] = null;

        for(int i = posicao; i < tam_atual; i++){
            lista[i] = lista[i+1];
        }
        tam_atual--;
    }

    public String toString(){
        String str = "";

        for(int i = 0; i < tam_atual; i++){
            str += lista[i] + ", ";
        }

        if(str != ""){
            str = "[" + str.substring(0, str.length()-2) + "]";
        }
        else{
            str = "[]";
        }
        return str;
    }

}
