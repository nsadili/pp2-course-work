package Week13;

import java.util.LinkedList;
import java.util.Queue;

public class ShoeShop {

    private static final int MAX_STOCK_SIZE = 10;
    private final Queue<Shoe> stock = new LinkedList<>();

    public synchronized void produceShoe() throws InterruptedException {
        while (stock.size() == MAX_STOCK_SIZE) {
            wait();
        }
        Shoe shoe = new Shoe();
        stock.add(shoe);
        System.out.println("Produced a shoe. Current stock size: " + stock.size());
        notifyAll();
    }

    public synchronized void sellShoe() throws InterruptedException {
        while (stock.isEmpty()) {
            wait();
        }
        Shoe shoe = stock.poll();
        System.out.println("Sold a shoe. Current stock size: " + stock.size());
        notifyAll();
    }

    public static void main(String[] args) {
        ShoeShop shop = new ShoeShop();
        int numProducers = 3;
        int numConsumers = 5;

        // Create producers
        for (int i = 0; i < numProducers; i++) {
            new Thread(() -> {
                while (true) {
                    try {
                        shop.produceShoe();
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

        // Create consumers
        for (int i = 0; i < numConsumers; i++) {
            new Thread(() -> {
                while (true) {
                    try {
                        shop.sellShoe();
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    private static class Shoe {
        // empty class, just for demonstration purposes
    }
}

