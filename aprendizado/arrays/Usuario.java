public class Usuario {
    
    String nome;
    int idade;

    Usuario(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    public boolean equals(Object objeto) {

        if(objeto instanceof Usuario){
            Usuario nuevo = (Usuario) objeto;
            boolean nomeIgual = nuevo.nome.equals(this.nome);
            boolean idadeIgual = nuevo.idade == this.idade;
            return nomeIgual && idadeIgual;
        }
        else return false;


    }
    
}
