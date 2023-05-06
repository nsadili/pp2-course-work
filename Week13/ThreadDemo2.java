package Week13;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Parallel p1 = new Parallel(0, null);
        Parallel p2 = new Parallel(0, null);
        Parallel p3 = new Parallel(0, null);
        Parallel p4 = new Parallel(0, null);

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
        } catch (InterruptedException ie) {
            System.out.println("Interrupted: " + ie);
        }
        System.out.println("Sum: " + Parallel.sum);
    }
}