class Parallel extends Thread {
    private long sum;
    private int id;

    public Parallel(int id, String name) {
        super(name);
        this.id = id;

    }

    public long getSum() {
        return sum;
    }

    public void run() {
            sum = 0;
            for (int i = 0; i < 1000000; i++) {
                sum += i * id + Math.pow(id, 3);
            }

        }
}

public class ProcTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Parallel t1 = new Parallel(1, "A");
        Parallel t2 = new Parallel(2, "B");
        Parallel t3 = new Parallel(3, "C");
        Parallel t4 = new Parallel(4, "D");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted" + e);

        }
        long sum = t1.getSum() + t2.getSum() + t3.getSum() + t4.getSum();
        long after = System.currentTimeMillis();
        System.out.println(sum);
        System.out.println(after - start);
    }
    
}
