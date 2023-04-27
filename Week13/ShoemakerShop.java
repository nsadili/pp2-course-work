package ex13.ConsumerProblem;

import java.util.LinkedList;

public class ShoemakerShop {
    private LinkedList<Shoe> stock = new LinkedList<>();
    private final int maxStockSize = 10;

    public synchronized void produceShoe() throws InterruptedException {
        while (stock.size() == maxStockSize) {
            wait();
        }
        stock.add(new Shoe());
        System.out.println("Produced a shoe. Current stock size: " + stock.size());
        notifyAll();
    }

    public synchronized void sellShoe() throws InterruptedException {
        while (stock.isEmpty()) {
            wait();
        }
        System.out.println("Sold a shoe. Current stock size: " + stock.size());
        notifyAll();
    }
}

class Producer implements Runnable {
    private ShoemakerShop shop;

    public Producer(ShoemakerShop shop) {
        this.shop = shop;
    }

    public void run() {
        while (true) {
            try {
                shop.produceShoe();
                Thread.sleep(1000); // wait for 1 second before producing another shoe
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private ShoemakerShop shop;

    public Consumer(ShoemakerShop shop) {
        this.shop = shop;
    }

    public void run() {
        while (true) {
            try {
                shop.sellShoe();
                Thread.sleep(2000); // wait for 2 seconds before trying to buy another shoe
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Shoe {
    // empty shoe class
}
