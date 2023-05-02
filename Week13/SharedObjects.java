public class SharedObjects {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Incrementor incrementor = new Incrementor(counter, 1000);
        Reader reader = new Reader(counter, 500);

        Thread t1 = new Thread(incrementor);
        Thread t2 = new Thread(reader);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

