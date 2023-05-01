package SharedObjects;

class Reader extends Thread {
    private Counter counter;
    private int N;

    public Reader(Counter counter, int N) {
        this.counter = counter;
        this.N = N;
    }

    @Override
    public void run() {
        for (int i = 0; i < N; i++) {
            synchronized (counter) {
                System.out.println("Counter value: " + counter.getCount());
            }
        }
    }
}