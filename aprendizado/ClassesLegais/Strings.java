public class Strings {
    public static void main(String[] args) {
        String nome = "George Brandão";
        System.out.println(nome);
        // String "Length" retorna o tamanho da String
        System.out.println(nome + " tem o tamanho de "+nome.length());
        //toUpperCase() coloca a string em caixa alta
        System.out.println(nome.toUpperCase());
        //toLowerCase() coloca a string em caixa baixa
        System.out.println(nome.toLowerCase());
        //indexOf() retorna o indice de um elemento na string
        System.out.println(nome.indexOf("G"));
        //concat() faz... you guessed it!
        String sobrenome = " Souza";
        System.out.println(nome.concat(sobrenome));
        //charAt() retorna o caracter no indice específicado
        System.out.println(nome.charAt(0));
        //contains() verifica se a String contém uma sequência 
        System.out.println(nome.contains("Bran"));
        //endsWith() verifica se uma String termina com um caracter
        System.out.println(nome.endsWith("o"));
        //equals() verifica se duas Strings são iguais
        System.out.println(nome.equals(sobrenome));
        //equalsIgnoreCase() verifica se duas strings são iguais, independente dos caracteres
        System.out.println(nome.toUpperCase().equalsIgnoreCase(nome.toLowerCase()));
    
    }
}
