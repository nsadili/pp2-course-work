package SharedObjects;

public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public synchronized void increment() {
        this.count++;
    }

    public synchronized int getCount() {
        return this.count;
    }
}