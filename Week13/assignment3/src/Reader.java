public class Reader extends Thread {
    private Counter counter;
    private int times;

    public Reader(Counter counter, int times) {
        this.counter = counter;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.times; i++) {
            synchronized (this.counter) {
                System.out.println(this.counter.getValue());
            }
        }
    }
}