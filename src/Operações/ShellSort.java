
package Operações;

import Strategy.Strategy;

public class ShellSort implements Strategy {

    @Override
    public int[] method(int[] vet) {
    
        long tempoInicial = System.nanoTime();
        int i, j, value;
        
        int gap = 1;
        while(gap < vet.length)
            gap = 3*gap+1;
        
        while(gap > 0){
            for(i = gap; i < vet.length; i++) {
                value = vet[i];
                
                j = i;
                while (j > gap-1 && value <= vet[j-gap]) {
                    vet[j] = vet[j - gap];
                    j = j - gap;
                }
            vet[j] = value;
            }
            gap = gap/3;
        }  
        
        System.out.println("Execution time of ShellSort: " 
                + (System.nanoTime()- tempoInicial) + "ns");
        
        return vet;
    }
    
    
    
}
