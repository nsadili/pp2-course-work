package lecture_notes.note_4;

public class Reader implements Runnable {
    Counter cnt;

    public Reader(Counter c) {
        cnt = c;
    }

    public void run() {
        for (int i = 0; i < 10; i++)
            cnt.getCount();
    }
}
