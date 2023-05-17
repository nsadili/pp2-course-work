package EX4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shop shop = new Shop();

        // One producer, one consumer
        new Producer(shop).start();
        new Consumer(shop).start();

        // One producer, multiple consumers
        new Producer(shop).start();
        for (int i = 0; i < 3; i++) {
            new Consumer(shop).start();
        }

        // Multiple producers, one consumer
        for (int i = 0; i < 3; i++) {
            new Producer(shop).start();
        }
        new Consumer(shop).start();
    }
}
