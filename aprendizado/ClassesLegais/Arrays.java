public class Arrays {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i+1;
        }
        for(int a: numeros){
            System.out.println(a);
        }

        int[][] miniMatriz = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                miniMatriz[i][j] = j + i;
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(miniMatriz[i][j] + " ");
            }
            System.out.println();
        }

    
    }
}
