package Week13.ProducerConsumerProblem;
import java.util.LinkedList;
import java.util.Queue;

class Shoe {
    private int id;
    public Shoe(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
} // shoe class with id

class Stock {
    private Queue<Shoe> shoes;
    private int capacity;

    public Stock(int capacity) {
        this.shoes = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void produce(Shoe shoe) throws InterruptedException {
        while (shoes.size() == capacity) {
            wait();
        }
        shoes.add(shoe);
        System.out.println("Shoe produced " + shoe.getId() + ", stock size of it: " + shoes.size());
        notifyAll();
    }

    public synchronized Shoe consume() throws InterruptedException {
        while (shoes.isEmpty()) {
            wait();
        }
        Shoe shoe = shoes.remove();
        System.out.println("Shoe consumed " + shoe.getId() + ", stock size of it: " + shoes.size());
        notifyAll();
        return shoe;
    }
} // stock class for shoes consumed and produced 

class Producer extends Thread {
    private Stock stock;
    private int numShoes;

    public Producer(Stock stock, int numShoes) {
        this.stock = stock;
        this.numShoes = numShoes;
    }

    public void run() {
        for (int i = 0; i < numShoes; i++) {
            try {
                stock.produce(new Shoe(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
} // producer - maker of shoes - Producer class that produces a specified number of shoes

class Consumer extends Thread {
    private Stock stock;

    public Consumer(Stock stock) {
        this.stock = stock;
    }

    public void run() {
        while (true) {
            try {
                stock.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
} // consumer - person who will buy those shoues form the producer - Consumer class that consumes shoes indefinitely

public class Problem {
    public static void main(String[] args) {
        int stockCapacity = 10;
        int numShoes = 20;

        Stock stock = new Stock(stockCapacity);
        Producer producer = new Producer(stock, numShoes);
        Consumer consumer = new Consumer(stock);

        producer.start();
        consumer.start();
    }
} // solution full all together


// This program creates a Stock class that holds Shoe objects and provides methods to produce and consume shoes
// The produce method adds a shoe to the queue if the stock is not full, and the consume method removes a shoe from the queue if the stock is not empty.
// The synchronized keyword is used in the produce and consume methods to ensure that only one thread can access the Stock object at a time, the same method as in the SharedObjects problem.
// The wait and notifyAll methods are used to signal when the stock is full or empty.
// The main method creates instances of the Stock, Producer, and Consumer classes and starts the producer and consumer threads.
