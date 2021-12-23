/*
Curso: Ciência de Computação

Aluno: George Brandão
Aluno: Eduardo Gomes
Aluno: Pedro Henrique
Aluno: Wemerson Ancelmo

Projeto 7.8
*/



public class Sorting {
    
    public void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int chave = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > chave){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = chave;
        }
    }


    
    public void bubbleSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j] > array[j+1]){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
    }



    public void selectionSort(int[] array){
        for(int i = 0; i < array.length-1; i++){

            int minIndex = i;

            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }



    public void shellSort(int[] array){
        int b = array.length;
        for(int gap = b/2; gap > 0; gap /= 2){

            for(int i = gap; i < b; i += 1){
                int temp = array[i];
                int j;

                for(j = i; j >= gap && array[j - gap] > temp; j -= gap){
                    array[j] = array[j - gap];
                }

                array[j] = temp;
            }
        }
    }



    private void merge(int[] leftArr, int[] rightArr, int[] arr){
        int tamEsquerda = arr.length / 2;
        int tamDireita = arr.length - tamEsquerda;
        int i = 0, l = 0, r = 0;

        while(l < tamEsquerda && r < tamDireita){
            if(leftArr[l] < rightArr[r]){
                arr[i] = leftArr[l];
                i++;
                l++;
            }
            else{
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }

        while(l < tamEsquerda){
            arr[i] = leftArr[l];
            i++;
            l++;
        }

        while(r < tamDireita){
            arr[i] = rightArr[r];
            i++;
            r++;
        }

    }

    public void mergeSort(int[] arr){
        int tam = arr.length;

        if(tam <= 1) return;

        int meio = tam/2;
        int[] leftArr = new int[meio];
        int[] rightArr = new int[tam - meio];

        int i = 0;
        int j = 0;

        for(; i < tam; i++){
            if(i < meio){
                leftArr[i] = arr[i];
            }
            else{
                rightArr[j] = arr[i];
                j++;
            }
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
    }
    


    public void quickSort(int[] array, int comeco, int fim){
        if(fim <= comeco) return;
        int pivot = partition(array, comeco, fim);
        quickSort(array, comeco, pivot-1);
        quickSort(array, pivot+1, fim);
        
    }
    
    public int partition(int[] array, int comeco, int fim){
        int pivot = array[fim];
        int i = comeco - 1;

        for(int j = comeco; j <= fim; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[fim];
        array[fim] = temp;
        return i;
    }

    

    public void heapSort(int[] arr){
        int tam = arr.length;

        for(int i = tam/2 - 1; i >= 0; i--){
            heapfy(arr, tam, i);
        }

        for(int i = tam - 1; i > 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapfy(arr, i, 0);
        }
    }

    private void heapfy(int[] arr, int n, int i){
        int maior = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if(l < n && arr[l] > arr[maior]){
            maior = l;
        }

        if(r < n && arr[r] > arr[maior]){
            maior = r;
        }

        if(maior != i){
            int troca = arr[i];
            arr[i] = arr[maior];
            arr[maior] = troca;

            heapfy(arr, n, maior);
        }
    }



    public void radixSort(int[] arr, int n){

        int max = getMax(arr, n);

        for(int exp = 1; max / exp > 0; exp *= 10){
            sort(arr, n, exp);
        }

    }

    private int getMax(int[] arr, int n){

        int max = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    private void sort(int[] arr, int n, int exp){

        int[] novoArr = new int[n];

        int i;

        int[] cont = new int[10];

        for(i = 0; i < n; i++){
            cont[(arr[i]/exp) %10]++;
        }

        for(i = 1; i < 10; i++){
            cont[i] += cont[i-1];
        }

        for(i = n - 1; i >= 0; i--){
            novoArr[cont[(arr[i] / exp) % 10] - 1] = arr[i];
            cont[(arr[i] / exp) % 10]--;
        }

        for(i = 0; i < n; i++){
            arr[i] = novoArr[i];
        }
    }
}
