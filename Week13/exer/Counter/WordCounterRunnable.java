package exer.Counter;

public class WordCounterRunnable implements Runnable {
    private final Counter counter;

    public WordCounterRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        // Do nothing, just wait for join()
    }
}
