import java.util.LinkedList;
import java.util.Queue;

public class Shop {
    private final int capacity;
    private final Queue<String> stock;

    public Shop(int capacity) {
        this.capacity = capacity;
        this.stock = new LinkedList<>();
    }

    public void produce(String shoe) throws InterruptedException {
        synchronized (stock) {
            while (stock.size() == capacity) {
                stock.wait();
            }
            stock.add(shoe);
            System.out.println("Produced: " + shoe);
            stock.notifyAll();
        }
    }

    public String consume() throws InterruptedException {
        synchronized (stock) {
            while (stock.isEmpty()) {
                stock.wait();
            }
            String shoe = stock.poll();
            System.out.println("Consumed: " + shoe);
            stock.notifyAll();
            return shoe;
        }
    }
}