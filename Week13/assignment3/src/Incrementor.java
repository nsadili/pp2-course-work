public class Incrementor implements Runnable {
    private Counter counter;
    private int timesToIncrement;

    public Incrementor(Counter counter, int timesToIncrement) {
        this.counter = counter;
        this.timesToIncrement = timesToIncrement;
    }

    @Override
    public void run() {
        for (int i = 0; i < timesToIncrement; i++) {
            counter.increment();
        }
    }
}
