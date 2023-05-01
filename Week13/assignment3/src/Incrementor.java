public class Incrementor extends Thread {
    private Counter counter;
    private int times;

    public Incrementor(Counter counter, int times) {
        this.counter = counter;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.times; i++) {
            synchronized (this.counter) {
                this.counter.increment();
            }
        }
    }
}