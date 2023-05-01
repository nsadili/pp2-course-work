package SharedObjects;

class Incrementor extends Thread {
    private Counter counter;
    private int N;

    public Incrementor(Counter counter, int N) {
        this.counter = counter;
        this.N = N;
    }

    @Override
    public void run() {
        for (int i = 0; i < N; i++) {
            synchronized (counter) {
                counter.increment();
            }
        }
    }
}
