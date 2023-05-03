public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Incrementor incrementor = new Incrementor(counter, 150);
        Reader reader = new Reader(counter, 80);
        Thread incrementorThread = new Thread(incrementor);
        Thread readerThread = new Thread(reader);
        incrementorThread.start();
        readerThread.start();
        incrementorThread.join();
        readerThread.join();
    }
}
