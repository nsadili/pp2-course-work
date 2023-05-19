package ProducerConsumerproblem;
import java.util.LinkedList;

class ShoemakerShop {
    private LinkedList<Integer> stock = new LinkedList<>();
    private int capacity;

    public ShoemakerShop(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int shoeId) throws InterruptedException {
        while (stock.size() == capacity) {
            System.out.println("Stock is full. Producer is waiting...");
            wait();
        }

        stock.add(shoeId);
        System.out.println("Producer produced shoe: " + shoeId);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (stock.size() == 0) {
            System.out.println("Stock is empty. Consumer is waiting...");
            wait();
        }

        int shoeId = stock.removeFirst();
        System.out.println("Consumer bought shoe: " + shoeId);
        notifyAll();

        return shoeId;
    }
}