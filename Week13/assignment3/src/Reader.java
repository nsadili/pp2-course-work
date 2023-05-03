public class Reader implements Runnable {
    private Counter counter;
    private int timesToRead;

    public Reader(Counter counter, int timesToRead) {
        this.counter = counter;
        this.timesToRead = timesToRead;
    }

    @Override
    public void run() {
        for (int i = 0; i < timesToRead; i++) {
            System.out.println("Counter value read: " + counter.getCount());
        }
    }
}
