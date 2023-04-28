package lecture_notes.note_4;

public class ThreadDemo4 {
    public static void main(String[] args) {
        Counter cnt = new Counter();

        Incrementor inc = new Incrementor(cnt);
        Reader cr = new Reader(cnt);

        Thread t1 = new Thread(inc);
        Thread t2 = new Thread(cr);

        t1.start();
        t2.start();
    }
}