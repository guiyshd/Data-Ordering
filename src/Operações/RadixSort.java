package Operações;

import Strategy.Strategy;
import java.util.Arrays;

public class RadixSort implements Strategy {

    static int radixGetMax(int vet[]){ 
        
        int mx = vet[0]; 
        for (int i = 1; i < vet.length; i++) 
            if (vet[i] > mx) 
                mx = vet[i]; 
        return mx; 
        
    } 
    
    static void radixCountSort(int vet[], int exp) { 
        
        int output[] = new int[vet.length];
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
  
        for (i = 0; i < vet.length; i++) 
            count[(vet[i]/exp)%10]++; 
  
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        for (i = vet.length - 1; i >= 0; i--) 
        { 
            output[count[ (vet[i]/exp)%10 ] - 1] = vet[i]; 
            count[(vet[i]/exp)%10]--; 
        } 
  
        for (i = 0; i < vet.length; i++) 
            vet[i] = output[i]; 
        
    }

    @Override
    public int[] method(int[] vet) {
    
        long tempoInicial = System.nanoTime();
        int m = radixGetMax(vet); 
  
        for (int exp = 1; m/exp > 0; exp *= 10) 
            radixCountSort(vet, exp);
        
        System.out.println("Execution time of RadixSort: " 
                + (System.nanoTime() - tempoInicial) + "ns");    
        
        return vet;
    }
    
}
