package EX3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        int N = 10;

        Incrementor incrementor = new Incrementor(counter, N);
        Reader reader = new Reader(counter, N);

        incrementor.start();
        reader.start();

        incrementor.join();
        reader.join();
    }
}
