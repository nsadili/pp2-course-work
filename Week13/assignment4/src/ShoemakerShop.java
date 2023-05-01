import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ShoemakerShop {
    private static final int MAX_STOCK = 6;
    private static final int MAX_WAIT_TIME = 4000;

    private static Queue<Shoe> stock = new LinkedList<>();

    public static void main(String[] args) {

        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        producer.start();
        consumer.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        producer.stopRunning();
        consumer.stopRunning();

        producer = new Producer();
        Consumer[] consumers = new Consumer[4];
        for (int i = 0; i < consumers.length; i++) {
            consumers[i] = new Consumer();
            consumers[i].start();
        }
        producer.start();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        producer.stopRunning();
        for (Consumer c : consumers) {
            c.stopRunning();
        }

        Producer[] producers = new Producer[3];
        for (int i = 0; i < producers.length; i++) {
            producers[i] = new Producer();
            producers[i].start();
        }
        consumer = new Consumer();
        consumer.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Producer p : producers) {
            p.stopRunning();
        }
        consumer.stopRunning();
    }

    private static class Producer extends Thread {
        private boolean running = true;

        public void stopRunning() {
            running = false;
        }

        @Override
        public void run() {
            while (running) {
                synchronized (stock) {
                    while (stock.size() == MAX_STOCK) {
                        try {
                            System.out.println("Producer is waiting. Stock is full.");
                            stock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    int numShoes = new Random().nextInt(3) + 1;
                    for (int i = 0; i < numShoes; i++) {
                        Shoe shoe = new Shoe();
                        stock.offer(shoe);
                        System.out.println("Producer added shoe to stock. Stock size: " + stock.size());
                    }

                    stock.notifyAll();
                }

                try {
                    Thread.sleep(new Random().nextInt(MAX_WAIT_TIME));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class Consumer extends Thread {
        private boolean running = true;

        public void stopRunning() {
            running = false;
        }

        @Override
        public void run() {
            while (running) {
                synchronized (stock) {
                    while (stock.isEmpty()) {
                        try {
                            System.out.println("Consumer is waiting. Stock is empty.");
                            stock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    Shoe shoe = stock.poll();
                    System.out.println("Consumer bought a shoe. Stock size: " + stock.size());

                    stock.notifyAll();
                }

                try {
                    Thread.sleep(new Random().nextInt(MAX_WAIT_TIME));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class Shoe {

    }
}