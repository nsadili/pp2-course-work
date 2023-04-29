package Week13;

class Counter {
    private int value;
    
    public Counter() {
        value = 0;
    }
    
    public synchronized void increment() {
        value++;
    }
    
    public synchronized int getValue() {
        return value;
    }
}

class Incrementor implements Runnable {
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

class Reader implements Runnable {
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

public class SaharedObjects {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int N = 1000;
        Thread incrementorThread = new Thread(new Incrementor(counter, N));
        Thread readerThread = new Thread(new Reader(counter, N));
        incrementorThread.start();
        readerThread.start();
    }
}

