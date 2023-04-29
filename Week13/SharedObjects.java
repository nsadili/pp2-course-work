package Week13;

public class SharedObjects {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Incrementor incrementor = new Incrementor(counter, 100000);
        Reader reader = new Reader(counter, 100000);

        incrementor.start();
        reader.start();
    }

    private static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public synchronized int getCount() {
            return count;
        }
    }

    private static class Incrementor extends Thread {
        private final Counter counter;
        private final int numIterations;

        public Incrementor(Counter counter, int numIterations) {
            this.counter = counter;
            this.numIterations = numIterations;
        }

        @Override
        public void run() {
            for (int i = 0; i < numIterations; i++) {
                synchronized (counter) {
                    counter.increment();
                }
            }
        }
    }

    private static class Reader extends Thread {
        private final Counter counter;
        private final int numIterations;

        public Reader(Counter counter, int numIterations) {
            this.counter = counter;
            this.numIterations = numIterations;
        }

        @Override
        public void run() {
            for (int i = 0; i < numIterations; i++) {
                synchronized (counter) {
                    System.out.println("Counter value: " + counter.getCount());
                }
            }
        }
    }
}
