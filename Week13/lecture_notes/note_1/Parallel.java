package lecture_notes.note_1;

public class Parallel extends Thread {
    private long sum;
    private int id;

    public Parallel(int id, String name) {
        super(name);
        this.id = id;
    }

    public long getSum() {
        return sum;
    }

    public void run() {
        sum = 0;
        for (int j = 0;j < 10_000_000; j++) {
            sum += id * j + Math.pow(id, 3);
        }
    }

}
