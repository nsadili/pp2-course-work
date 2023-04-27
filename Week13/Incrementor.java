package ex13.SharedObjects;

public class Incrementor implements Runnable {
    private final Counter counter;
    private final int numIncrements;

    public Incrementor(Counter counter, int numIncrements) {
        this.counter = counter;
        this.numIncrements = numIncrements;
    }

    @Override
    public void run() {
        for (int i = 0; i < numIncrements; i++) {
            counter.increment();
        }
    }
}
