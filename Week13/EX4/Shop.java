package EX4;

import java.util.LinkedList;
import java.util.Queue;

class Shop {
    private final int MAX_SIZE = 10; // maximum number of shoes in stock
    private final Queue<Object> shoes = new LinkedList<>(); // queue to hold shoes

    public void produce() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (shoes.size() == MAX_SIZE) { // if stock is full, wait
                    wait();
                }
                Object shoe = new Object(); // create a new shoe
                shoes.add(shoe);
                System.out.println("Produced a shoe. Shoes in stock: " + shoes.size());
                notifyAll(); // notify consumers
                Thread.sleep(1000); // sleep for a bit to simulate production time
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (shoes.size() == 0) { // if stock is empty, wait
                    wait();
                }
                shoes.poll(); // buy a shoe
                System.out.println("Bought a shoe. Shoes in stock: " + shoes.size());
                notifyAll(); // notify producers
                Thread.sleep(1000); // sleep for a bit to simulate buying time
            }
        }
    }
}

class Producer extends Thread {
    private Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            shop.produce();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {
    private Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            shop.consume();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}