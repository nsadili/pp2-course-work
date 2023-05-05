package ex13.ConsumerProblem;

public class Main {
    public static void main(String[] args) {
        ShoemakerShop shop = new ShoemakerShop();
        Producer producer = new Producer(shop);
        Consumer consumer = new Consumer(shop);

        // test with one producer and one consumer
        new Thread(producer).start();
        new Thread(consumer).start();

        // test with one producer and multiple consumers
        for (int i = 0; i < 3; i++) {
            new Thread(new Consumer(shop)).start();
        }

        // test with multiple producers and one consumer
        for (int i = 0; i < 2; i++) {
            new Thread(new Producer(shop)).start();
        }
        new Thread(consumer).start();
    }
}