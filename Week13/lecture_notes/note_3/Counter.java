package lecture_notes.note_3;

public class Counter {
    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public int getCount() {
        return c;
    }
}
