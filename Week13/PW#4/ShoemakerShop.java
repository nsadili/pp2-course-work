import java.util.LinkedList;
import java.util.Queue;

class Shop {
    private final int maxSize;
    private final Queue<String> stock = new LinkedList<>();

    public Shop(int maxSize) {
        this.maxSize = maxSize;
    }

    public synchronized void produce() {
        while (stock.size() >= maxSize) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String shoe = "Shoe " + (stock.size() + 1);
        stock.add(shoe);
        System.out.println("Produced: " + shoe);
        notifyAll();
    }

    public synchronized void consume() {
        while (stock.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String shoe = stock.remove();
        System.out.println("Consumed: " + shoe);
        notifyAll();
    }
}

class Producer extends Thread {
    private final Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true) {
            shop.produce();
        }
    }
}

class Consumer extends Thread {
    private final Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true) {
            shop.consume();
        }
    }
}

public class ShoemakerShop {
    public static void main(String[] args) {
        Shop shop = new Shop(10);

         Producer producer1 = new Producer(shop);
        Consumer consumer1 = new Consumer(shop);

        producer1.start();
        consumer1.start();

        try {
            producer1.join();
            consumer1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         Producer producer2 = new Producer(shop);
        Consumer consumer2a = new Consumer(shop);
        Consumer consumer2b = new Consumer(shop);

        producer2.start();
        consumer2a.start();
        consumer2b.start();

        try {
            producer2.join();
            consumer2a.join();
            consumer2b.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         Producer producer3a = new Producer(shop);
        Producer producer3b = new Producer(shop);
        Consumer consumer3 = new Consumer(shop);

        producer3a.start();
        producer3b.start();
        consumer3.start();

        try {
            producer3a.join();
            producer3b.join();
            consumer3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
