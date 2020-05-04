
import Operações.BubbleSort;
import Operações.HeapSort;
import Operações.InsertionSort;
import Operações.MergeSort;
import Operações.QuickSort;
import Operações.RadixSort;
import Operações.SelectionSort;
import Operações.ShellSort;
import Strategy.Context;
import java.util.Scanner;

public class Principal {
 
    
    public static void algorithms(int[] vector){
        
            int[] temp = new int[vector.length];
        
            int count=0;
            while (count < 9) {        
 
            System.arraycopy(vector, 0, temp, 0, vector.length);
            
            if (count == 1) {
                Context context = new Context(new BubbleSort());
                context.order(temp);
            } else if (count == 2) {
                Context context = new Context(new InsertionSort());
                context.order(temp);
            } else if (count == 3) {
                Context context = new Context(new SelectionSort());
                context.order(temp);
            } else if (count == 4) {
                Context context = new Context(new ShellSort());
                context.order(temp);
            } else if (count == 5) {
                Context context = new Context(new HeapSort());
                context.order(temp);
            } else if (count == 6) {
                Context context = new Context(new RadixSort());
                context.order(temp);
            } else if (count == 7) {
                Context context = new Context(new MergeSort());
                context.order(temp);
            } else if (count == 8){
                Context context = new Context(new QuickSort());
                context.order(temp);
            }
            count++;
        
        }
    
    }            
            
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insert the size of the vector: ");
        int size = scan.nextInt();
       
        int[] vector = new int[size];

        int qtd=1;
        while(qtd < 11){
            System.out.println("------------------------- " + (qtd) + "o Teste -------------------------");

            for (int i = 0; i < vector.length; i++)
                vector[i] = (int) (Math.random()*size);

            algorithms(vector);

            qtd++;
       }
        
    }
    
}
