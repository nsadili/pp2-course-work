public class Incrementor implements Runnable {
    private Counter counter;
    private int N;

    public Incrementor(Counter counter, int N) {
        this.counter = counter;
        this.N = N;
    }

    public void run() {
        for (int i = 0; i < N; i++) {
            counter.increment();
        }
    }
}