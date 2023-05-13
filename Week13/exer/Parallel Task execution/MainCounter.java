public class MainCounter {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Incrementor incrementor = new Incrementor(counter, 1000);
        Reader reader = new Reader(counter, 1000);

        Thread incrementorThread = new Thread(incrementor);
        Thread readerThread = new Thread(reader);

        incrementorThread.start();
        readerThread.start();

        try {
            incrementorThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + counter.getCount());
    }
}