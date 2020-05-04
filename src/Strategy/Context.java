
package Strategy;

public class Context {
    
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public int[] order(int[] vet){
        return strategy.method(vet);
    }
}
