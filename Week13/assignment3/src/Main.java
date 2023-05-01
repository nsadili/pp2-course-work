public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int N = 700;
        Incrementor incrementor = new Incrementor(counter, N);
        Reader reader = new Reader(counter, N);

        incrementor.start();
        reader.start();

        try {
            incrementor.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter value after incrementing: " + counter.getValue());
    }
}