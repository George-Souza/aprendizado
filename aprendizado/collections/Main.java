public class Main {
    public static void main(String[] args) {
        
        int[] novoArr = new int[6];

        novoArr[0] = 4;
        novoArr[1] = 2;
        novoArr[2] = 0;
        novoArr[3] = 5;
        novoArr[4] = 1;
        novoArr[5] = 6;

        for(int v: novoArr){
            System.out.print(v + " ");
        }
        System.out.println();
        
        Sorting ob = new Sorting();
        
        ob.radixSort(novoArr, novoArr.length);
        for(int v: novoArr){
            System.out.print(v + " ");
        }
    }
}
