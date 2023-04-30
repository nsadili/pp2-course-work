package lecture_notes.note_4;

public class Incrementor implements Runnable {
    Counter cnt;

    public Incrementor(Counter c) {
        cnt = c;
    }

    public void run() {
        for (int i = 0; i < 10; i++)
            cnt.increment();
    }
}
