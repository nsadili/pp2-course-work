package lecture_notes.note_1;

public class ParallelTest {
    public static void main(String args[]) {
        Parallel t1 = new Parallel(1, "A");
        Parallel t2 = new Parallel(2, "B");
        Parallel t3 = new Parallel(3, "C");
        Parallel t4 = new Parallel(4, "D");

        long before = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException ex) {
            System.out.println("Interrupted: " + ex);
        }
        long after = System.currentTimeMillis();

        System.out.println("Time spend " + (after - before) + " millis");

        long sum = t1.getSum() + t2.getSum() + t3.getSum() + t4.getSum();
        System.out.println("Result: " + sum);
    }
}
