package Operações;

import Strategy.Strategy;

public class QuickSort implements Strategy {

    public static void responsivenessQuickSort(int vet[], int i, int f) {
        
        int left = i;
        int right = f;
        int pivot = vet[(left + right) / 2];
        int change;

        while (left <= right) {
            
                while (vet[left] < pivot)
                        left = left + 1;

                while (vet[right] > pivot)
                        right = right - 1;

                if (left <= right) {
                        change = vet[left];
                        vet[left] = vet[right];
                        vet[right] = change;
                        left = left + 1;
                        right = right - 1;
                }
        }

        if (right > i)
                responsivenessQuickSort(vet, i, right);

        if (left < f)
                responsivenessQuickSort(vet, left, f);
    }

    @Override
    public int[] method(int[] vet) {
        
        long tempoInicial = System.nanoTime();
        int i=0, f=vet.length-1;
        
        responsivenessQuickSort(vet, i, f);
        
        System.out.println("Execution time of QuickSort: " 
                + (System.nanoTime()- tempoInicial) + "ns");
        
        return vet;
    }
    
}
