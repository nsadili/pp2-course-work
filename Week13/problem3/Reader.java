
public class Reader extends Thread {
    private Counter counter;
    private int N;

    public Reader(Counter counter, int N) {
        this.counter = counter;
        this.N = N;
    }

    public void run() {
        for (int i = 0; i < N; i++) {
            System.out.println("Counter value: " + counter.getValue());
        }
    }
}