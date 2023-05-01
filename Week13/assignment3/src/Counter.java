public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public synchronized void increment() {
        this.value++;
    }

    public synchronized int getValue() {
        return this.value;
    }
}
