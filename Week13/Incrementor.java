public class Incrementor implements Runnable {
    private Counter counter;
    private int numIncrements;

    public Incrementor(Counter counter, int numIncrements) {
        this.counter = counter;
        this.numIncrements = numIncrements;
    }

    public void run() {
        for (int i = 0; i < numIncrements; i++) {
            counter.increment();
        }
    }
}