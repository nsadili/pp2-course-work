package EX3;

class Counter {
    private int value = 0;

    public synchronized void increment() {
        value++;
    }

    public synchronized int getValue() {
        return value;
    }
}

class Incrementor extends Thread {
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
        }
    }
}

class Reader extends Thread {
    private Counter counter;
    private int times;

    public Reader(Counter counter, int times) {
        this.counter = counter;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(counter.getValue());
        }
    }
}
