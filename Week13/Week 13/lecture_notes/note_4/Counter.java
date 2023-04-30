package lecture_notes.note_4;

public class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println("Increment: " + count);
    }

    public synchronized int getCount() {
        System.out.println("Get: " + count);
        return count;
    }
}
