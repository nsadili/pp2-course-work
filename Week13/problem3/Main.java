
public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0);
        Incrementor incrementor = new Incrementor(counter, 10000);
        Reader reader = new Reader(counter, 10000);

        incrementor.start();
        reader.start();

        try {
            incrementor.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + counter.getValue());
    }
}