package ex13.SharedObjects;

public class Reader implements Runnable {
    private final Counter counter;
    private final int numReads;

    public Reader(Counter counter, int numReads) {
        this.counter = counter;
        this.numReads = numReads;
    }

    @Override
    public void run() {
        for (int i = 0; i < numReads; i++) {
            int count = counter.getCount();
            System.out.println("Reader: count = " + count);
        }
    }
}
