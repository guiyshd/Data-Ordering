package Operações;

import Strategy.Strategy;

public class BubbleSort implements Strategy {

    @Override
    public int[] method(int[] vet) {
                
        long tempoInicial = System.nanoTime();

            int i, j, aux, n = vet.length;

            for(i=1; i<n; i++){
                for(j=0; j<n-i; j++){
                    if(vet[j] > vet[j+1]){
                        aux = vet[j];
                        vet[j] = vet[j+1];
                        vet[j+1] = aux;
                    }
                }
            }
            
        System.out.println("Execution time of BubbleSort: " 
                + (System.nanoTime() - tempoInicial) + "ns");
        
        return vet;
    }
    
}

