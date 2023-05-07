package Week13;
public class Counter {
    private int value;
    public synchronized void increment() {
        value++;
    }
    public synchronized int getValue() {
        return value;
    }
}
public class Incrementor extends Thread {
    private Counter counter;
    private int n;
    public Incrementor(Counter counter, int n) {
        this.counter = counter;
        this.n = n;
    }
    public void run() {
        for (int i = 0; i < n; i++) {
            synchronized (counter) {
                counter.increment();
            }
        }
    }
}
public class Reader extends Thread {
    private Counter counter;
    private int n;
    public Reader(Counter counter, int n) {
        this.counter = counter;
        this.n = n;
    }
    public void run() {
        for (int i = 0; i < n; i++) {
            synchronized (counter) {
                System.out.println(counter.getValue());
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int n = 10_000;
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
        System.out.println("Final value: " + counter.getValue());
    }
}
