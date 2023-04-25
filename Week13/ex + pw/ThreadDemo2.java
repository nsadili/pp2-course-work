class Parallel extends Thread {
    static int sum;

    public Parallel(int i, String string) {
    }

    public Parallel() {
    }

    public static void increment() {
        int t = sum;
        t = t + 1;
        sum = t;
    }

    public void run() {
        for (int j = 0; j < 1000; j++)
            increment();
    }

    public long getSum() {
        return 0;
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        Parallel p1 = new Parallel();
        Parallel p2 = new Parallel();
        Parallel p3 = new Parallel();
        Parallel p4 = new Parallel();

        Parallel.sum = 0;
        p1.start();
        p2.start();
        p3.start();
        p4.start();

        try {
            p1.join();
            p2.join();
            p3.join();
            p4.join();
        } catch (InterruptedException ex) {
            System.out.println("Interrupted" + ex);
        }

        System.out.println("Sum: " + Parallel.sum);

    }
}
