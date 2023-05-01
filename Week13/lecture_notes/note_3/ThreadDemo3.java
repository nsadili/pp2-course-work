package lecture_notes.note_3;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Counter cnt = new Counter();
        Parallel p1 = new Parallel(cnt);
        Parallel p2 = new Parallel(cnt);
        Parallel p3 = new Parallel(cnt);
        Parallel p4 = new Parallel(cnt);

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
        System.out.println("Sum: " + cnt.getCount());
    }
}
