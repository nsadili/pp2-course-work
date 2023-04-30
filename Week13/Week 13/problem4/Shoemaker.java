package problem4;

public class Shoemaker {
    private Integer stock;
    private Integer capacity;
    public Shoemaker(Integer stock, Integer capacity) {
        this.stock = stock;
        this.capacity = capacity;
    }

    public synchronized void produceShoe() {
        try {
            while (stock == capacity) {
                System.out.println("...Stock is full. Waiting for customers...");
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stock += 1;
        notifyAll();
        System.out.println("\n--- Produced a shoe. Stock size: " + stock + " ---\n");
    }

    public synchronized void sellShoe() {
        try {
            while (stock == 0) {
                System.out.println("...Stock is empty. Waiting for shoes to be produced...");
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stock -= 1;
        notifyAll();
        System.out.println("\n--- Sold a shoe. Stock size: " + stock + " ---\n");
    }
}