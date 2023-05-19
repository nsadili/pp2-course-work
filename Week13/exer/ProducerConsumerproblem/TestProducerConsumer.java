import java.util.LinkedList;



public class TestProducerConsumer {
    public static void main(String[] args) {
        int capacity = 5;
        int totalShoes = 10;

        ShoemakerShop shop = new ShoemakerShop(capacity);

        // One producer, one consumer
        Thread producerThread = new Thread(new Producer(shop, totalShoes));
        Thread consumerThread = new Thread(new Consumer(shop));

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // One producer, multiple consumers
        Thread producerThread2 = new Thread(new Producer(shop, totalShoes));
        Thread consumerThread2 = new Thread(new Consumer(shop));
        Thread consumerThread3 = new Thread(new Consumer(shop));

        producerThread2.start();
        consumerThread2.start();
        consumerThread3.start();

        try {
            producerThread2.join();
            consumerThread2.join();
            consumerThread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Multiple producers, one consumer
        Thread producerThread3 = new Thread(new Producer(shop, totalShoes));
        Thread producerThread4 = new Thread(new Producer(shop, totalShoes));
        Thread consumerThread4 = new Thread(new Consumer(shop));

        producerThread3.start();
        producerThread4.start();
        consumerThread4.start();

        try {
            producerThread3.join();
            producerThread4.join();
            consumerThread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
