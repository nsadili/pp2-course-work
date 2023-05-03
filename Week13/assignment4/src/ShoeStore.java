import java.util.LinkedList;

public class ShoeStore {
    private final int MAX_STOCK = 10;
    private LinkedList<String> stock = new LinkedList<>();

    public synchronized void produce() throws InterruptedException {
        while (stock.size() == MAX_STOCK) {
            wait();
        }

        stock.add("Shoe");
        System.out.println("New shoe produced! Current stock: " + stock.size());

        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (stock.size() == 0) {
            wait();
        }

        String shoe = stock.removeFirst();
        System.out.println("Shoe sold! Current stock: " + stock.size());

        notifyAll();
    }

    public static void main(String[] args) {
        ShoeStore shoeStore = new ShoeStore();

        // One producer, one consumer
        new Thread(() -> {
            try {
                while (true) {
                    shoeStore.produce();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                while (true) {
                    shoeStore.consume();
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // One producer, multiple consumers
        new Thread(() -> {
            try {
                while (true) {
                    shoeStore.produce();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                while (true) {
                    shoeStore.consume();
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                while (true) {
                    shoeStore.consume();
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Multiple producers, one consumer
        new Thread(() -> {
            try {
                while (true) {
                    shoeStore.produce();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                while (true) {
                    shoeStore.produce();
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                while (true) {
                    shoeStore.consume();
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
