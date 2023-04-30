package lecture_notes.note_2;

public class Parallel extends Thread {
    static int sum;

    public static void increment() {
        int t = sum;
        t = t + 1;
        sum = t;
    }

    public void run() {
        for (int j = 0; j < 1000; j++)
            increment();
    }
}