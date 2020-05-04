package Operações;

import Strategy.Strategy;

public class HeapSort implements Strategy {
 
    public static void heap(int vet[], int heapSize, int i) {
    
        int bigger = i;
        int left  = 2*i + 1;
        int right  = 2*i + 2;

        if (left  < heapSize && vet[left] > vet[bigger])
            bigger = left ;

        if (right  < heapSize && vet[right] > vet[bigger])
            bigger = right ;

        if (bigger != i) {
            int swap = vet[i];
            vet[i] = vet[bigger];
            vet[bigger] = swap;

            heap(vet, heapSize, bigger);
        }
    }

    @Override
    public int[] method(int[] vet) {
        
        long tempoInicial = System.nanoTime();
        int size = vet.length;

        for (int i = size / 2 - 1; i >= 0; i--)
            heap(vet, size, i);

        for (int i=size-1; i>=0; i--) {

            int x = vet[0];
            vet[0] = vet[i];
            vet[i] = x;

            heap(vet, i, 0);
        }
        
        System.out.println("Execution time of HeapSort: " 
                + (System.nanoTime()- tempoInicial) + "ns");
        
        return vet;
        
    }
    
}
