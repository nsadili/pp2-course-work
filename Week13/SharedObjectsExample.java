class Counter {
    private int value;

    public synchronized void increment() {
        value++;
    }

    public synchronized int getValue() {
        return value;
    }
}

class Incrementor extends Thread {
    private final Counter counter;
    private final int n;

    public Incrementor(Counter counter, int n) {
        this.counter = counter;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            counter.increment();
        }
    }
}

class Reader extends Thread {
    private final Counter counter;
    private final int n;

    public Reader(Counter counter, int n) {
        this.counter = counter;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Counter value: " + counter.getValue());
        }
    }
}

public class SharedObjectsExample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int n = 10;
        Incrementor incrementor = new Incrementor(counter, n);
        Reader reader = new Reader(counter, n);

        incrementor.start();
        reader.start();

        try {
            incrementor.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + counter.getValue());
    }
}