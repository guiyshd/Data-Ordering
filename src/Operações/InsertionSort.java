package Operações;

import Strategy.Strategy;

public class InsertionSort implements Strategy { 

    @Override
    public int[] method(int[] vet) {
        
        long tempoInicial = System.nanoTime();
        
        int i, j, aux;
        
        for(j = 1; j < vet.length; j++){
            aux = vet[j];
            for(i = j-1; i >= 0 && vet[i] > aux; i--)
                vet[i+1] = vet[i];
            vet[i+1] = aux;
        }
        
        System.out.println("Execution time of InsertionSort: " 
                + (System.nanoTime() - tempoInicial) + "ns");
        
        return vet;
    }
}

