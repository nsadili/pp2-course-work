public class Reader implements Runnable {
    private Counter counter;
    private int numReads;

    public Reader(Counter counter, int numReads) {
        this.counter = counter;
        this.numReads = numReads;
    }

    public void run() {
        for (int i = 0; i < numReads; i++) {
            System.out.println("Counter value: " + counter.getValue());
        }
    }
}