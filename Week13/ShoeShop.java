package Week13;

import java.util.LinkedList;
import java.util.Queue;

public class ShoeShop {
    private static final int MAX_STOCK = 5; // Maximum stock capacity
    private Queue<Shoe> stock = new LinkedList<>();

    public static void main(String[] args) {
        ShoeShop shoeShop = new ShoeShop();

        // One producer, one consumer
        Thread producerThread = new Thread(new Producer(shoeShop));
        Thread consumerThread = new Thread(new Consumer(shoeShop));
        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        shoeShop.resetStock();

        System.out.println();

        // One producer, multiple consumers
        producerThread = new Thread(new Producer(shoeShop));
        Thread consumerThread1 = new Thread(new Consumer(shoeShop));
        Thread consumerThread2 = new Thread(new Consumer(shoeShop));
        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();

        try {
            producerThread.join();
            consumerThread1.join();
            consumerThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        shoeShop.resetStock();

        System.out.println();

        // Multiple producers, one consumer
        Thread producerThread1 = new Thread(new Producer(shoeShop));
        Thread producerThread2 = new Thread(new Producer(shoeShop));
        consumerThread = new Thread(new Consumer(shoeShop));
        producerThread1.start();
        producerThread2.start();
        consumerThread.start();

        try {
            producerThread1.join();
            producerThread2.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void produceShoe() throws InterruptedException {
        while (stock.size() >= MAX_STOCK) {
            wait();
        }

        Shoe shoe = new Shoe();
        stock.offer(shoe);
        System.out.println("Produced shoe: " + shoe);

        notifyAll();
    }

    public synchronized Shoe sellShoe() throws InterruptedException {
        while (stock.isEmpty()) {
            wait();
        }

        Shoe shoe = stock.poll();
        System.out.println("Sold shoe: " + shoe);

        notifyAll();

        return shoe;
    }

    public synchronized void resetStock() {
        stock.clear();
    }
}

class Shoe {}

class Producer implements Runnable {
    private ShoeShop shoeShop;

    public Producer(ShoeShop shoeShop) {
        this.shoeShop = shoeShop;
    }

    @Override
    public void run() {
        try {
            while (true) {
                shoeShop.produceShoe();
                Thread.sleep(1000); // Simulate shoe production time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    public Consumer(ShoeShop shoeShop) {
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(2000); // Simulate customer buying time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
