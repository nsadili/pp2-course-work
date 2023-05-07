package Week13.SharedObjects;

class Counter {
    private int count;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
} // Counter part 

class Incrementor extends Thread {
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
} // Incrementor part

class Reader extends Thread {
    private Counter counter;
    private int N;
    public Reader(Counter counter, int N) {
        this.counter = counter;
        this.N = N;
    }
    public void run() {
        for (int i = 0; i < N; i++) {
            System.out.println("Value of counter: " + counter.getCount());
        }
    }
} // Reader for getting the value of the counter

public class Problem {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int N = 1000;

        Incrementor incrementor = new Incrementor(counter, N);
        Reader reader = new Reader(counter, N);

        incrementor.start();
        reader.start();

        try {
            incrementor.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + counter.getCount());
    }
} // final solution to the problem itself that finds the final value of the counter



// This program creates an instance of the Counter class and two threads, Incrementor and Reader.
// The Incrementor thread calls the increment() method of the Counter class N times, while the Reader thread calls the getCount() method of the Counter class
// Value printed N times. 
// The synchronized keyword is used in the increment() and getCount() methods to ensure that only one thread can access the Counter object at a time.
// The main thread waits for both the Incrementor and Reader threads to finish using the join() method, and then prints the final value of the counter.
