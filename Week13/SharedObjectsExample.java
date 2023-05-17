package Week13;

public class SharedObjectsExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create Incrementor thread
        Incrementor incrementor = new Incrementor(counter, 5); // N = 5
        Thread incrementorThread = new Thread(incrementor);

        // Create Reader thread
        Reader reader = new Reader(counter, 5); // N = 5
        Thread readerThread = new Thread(reader);

        // Start the threads
        incrementorThread.start();
        readerThread.start();
    }
}

class Counter {
    private int value;

    public synchronized void increment() {
        value++;
        System.out.println("Incremented counter: " + value);
    }

    public synchronized int getValue() {
        return value;
    }
}

class Incrementor implements Runnable {
    private Counter counter;
    private int times;

    public Incrementor(Counter counter, int times) {
        this.counter = counter;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            counter.increment();
            try {
                Thread.sleep(500); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Reader implements Runnable {
    private Counter counter;
    private int times;

    public Reader(Counter counter, int times) {
        this.counter = counter;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            int value = counter.getValue();
            System.out.println("Read counter value: " + value);
            try {
                Thread.sleep(500); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
