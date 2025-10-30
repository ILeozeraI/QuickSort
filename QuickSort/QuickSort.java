import java.util.Arrays;



public class QuickSort {



//Método principal que inicia o processo de ordenação

public static void quickSort(int[] array,int low,int high) {

//Condição base:se o low form menor que high, existe elementos para ordenar

if(low < high) {

//Encontro o índice pivô depois de particionar

int partitionIndex = partition(array,low,high);



//chamada recursiva para o subarray à esquerda do pivô

quickSort(array,low,partitionIndex-1);

//Chamada recursiva para o subarray à direita d pivô

quickSort(array,partitionIndex+1,high);

}

}

//Método que particiona o array em duas partes a partir do pivô

private static int partition(int[] array, int low, int high) {

//Escolhe o último elemento como pivô

int pivo = array[high];



//criar indice do menor elemento

int i = (low-1);



//Percorre o array do low até o high-1

for(int j=low;j<high;j++) {

//se o elemento atual for menor ou igual ao pivô

if(array[j] <= pivo) {

i++;





//troca o elemento atual com um elemento de indice i

int temp = array[i];

array[i] = array[j];

array[j] = temp;

}



}

//troca o pivô para posição correta(entre os menores e os maiores)

int temp = array[i+1];

array[i+1] = array[high];

array[high] = temp;



return i+1;



}

public static void main(String[] args) {

// TODO Auto-generated method stub



int[] dados = {10,7,8,9,1,5};



System.out.println("\nArray original: "+Arrays.toString(dados));

quickSort(dados,0,dados.length-1);

System.out.println("\nDepois de ordenado: "+Arrays.toString(dados));

}



}