package Operações;

import Strategy.Strategy;

public class SelectionSort implements Strategy {

    @Override
    public int[] method(int[] vet) {
    
        long tempoInicial = System.nanoTime();
        
        int fixo, menor, i, t;
        
        for(fixo = 0; fixo < vet.length-1; fixo++){
            menor = fixo;
            
            for(i = menor+1; i < vet.length; i++)
                if(vet[i] < vet[menor])
                    menor = i;
        
            if(menor != fixo){
                t = vet[fixo];
                vet[fixo] = vet[menor];
                vet[menor] = t;
            }
        }
     
        System.out.println("Execution time of SelectionSort: " 
                + (System.nanoTime() - tempoInicial) + "ns");
        
        return vet;
    }
}
