package Week13;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    public static void main(String[] args) {
        Queue<Integer> stock = new LinkedList<>();
        int maxStock = 5;

        Producer producer = new Producer(stock, maxStock);
        Consumer consumer = new Consumer(stock);

        producer.start();
        consumer.start();
    }

    private static class Producer extends Thread {
        private final Queue<Integer> stock;
        private final int maxStock;

        public Producer(Queue<Integer> stock, int maxStock) {
            this.stock = stock;
            this.maxStock = maxStock;
        }

        @Override
        public void run() {
            int shoeCount = 0;

            while (true) {
                synchronized (stock) {
                    if (stock.size() < maxStock) {
                        stock.offer(++shoeCount);
                        System.out.println("Produced shoe " + shoeCount);

                        // Notify consumer that a shoe has been produced
                        stock.notify();
                    } else {
                        try {
                            // Wait for consumer to consume a shoe
                            stock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    private static class Consumer extends Thread {
        private final Queue<Integer> stock;

        public Consumer(Queue<Integer> stock) {
            this.stock = stock;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (stock) {
                    if (!stock.isEmpty()) {
                        int shoe = stock.poll();
                        System.out.println("Bought shoe " + shoe);

                        // Notify producer that a shoe has been consumed
                        stock.notify();
                    } else {
                        try {
                            // Wait for producer to produce a shoe
                            stock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
