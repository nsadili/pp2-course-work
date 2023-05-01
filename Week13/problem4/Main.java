import java.util.LinkedList;

class ShoemakerShop {
    private LinkedList<Shoe> stock = new LinkedList<Shoe>();
    private final int MAX_STOCK = 10;
    
    public synchronized void produceShoe() throws InterruptedException {
        while (stock.size() == MAX_STOCK) {
            wait();
        }
        
        stock.add(new Shoe());
        System.out.println("Produced shoe, stock size is now " + stock.size());
        
        notifyAll();
    }
    
    public synchronized Shoe sellShoe() throws InterruptedException {
        while (stock.size() == 0) {
            wait();
        }
        
        Shoe shoe = stock.remove();
        System.out.println("Sold shoe, stock size is now " + stock.size());
        
        notifyAll();
        
        return shoe;
    }
}

class Shoe {}

class Producer implements Runnable {
    private ShoemakerShop shop;
    private int numShoesToProduce;
    
    public Producer(ShoemakerShop shop, int numShoesToProduce) {
        this.shop = shop;
        this.numShoesToProduce = numShoesToProduce;
    }
    
    public void run() {
        for (int i = 0; i < numShoesToProduce; i++) {
            try {
                shop.produceShoe();
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
                Shoe shoe = shop.sellShoe();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ShoemakerShop shop = new ShoemakerShop();
        
        // One producer, one consumer
        Thread producer1 = new Thread(new Producer(shop, 10));
        Thread consumer1 = new Thread(new Consumer(shop));
        producer1.start();
        consumer1.start();
        
        // One producer, multiple consumers
        Thread producer2 = new Thread(new Producer(shop, 10));
        Thread consumer2a = new Thread(new Consumer(shop));
        Thread consumer2b = new Thread(new Consumer(shop));
        producer2.start();
        consumer2a.start();
        consumer2b.start();
        
        // Multiple producers, one consumer
        Thread producer3a = new Thread(new Producer(shop, 5));
        Thread producer3b = new Thread(new Producer(shop, 5));
        Thread consumer3 = new Thread(new Consumer(shop));
        producer3a.start();
        producer3b.start();
        consumer3.start();
    }
}
