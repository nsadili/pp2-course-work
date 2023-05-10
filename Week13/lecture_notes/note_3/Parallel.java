package lecture_notes.note_3;

public class Parallel extends Thread {
    private Counter cnt;

    public Parallel(Counter c) {
        this.cnt = c;
    }

    public void run() {
        for (int j = 0; j < 1000; j++)
            cnt.increment();
    }
}
