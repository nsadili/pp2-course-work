package lecture_notes.note_2;

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
        } catch (InterruptedException ie) {
            System.out.println("Interrupted: " + ie);
        }
        System.out.println("Sum: " + Parallel.sum);
    }
}