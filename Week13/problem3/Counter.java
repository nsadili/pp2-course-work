public class Counter {
    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public synchronized void increment() {
        value++;
    }

    public synchronized int getValue() {
        return value;
    }
}