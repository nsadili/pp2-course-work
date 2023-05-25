package Week13;
import java.util.*;

public class Stock {
	private Integer productId = 1;
	private Integer capacity; // #of cells in the shelf
	private LinkedList<Integer> goods;// queue implementation
	private final Integer PAUSE_AFTER_EACH_OP = 1500;
	private final Random rand;

	public Stock(int capacity) {
		this.capacity = capacity;
		this.goods = new LinkedList<Integer>();
		this.rand = new Random();
	}

	public void produce() throws InterruptedException {
		// TODO
		while (true) {
			synchronized (goods) {
				while (goods.size() == capacity) {
					System.out.println(Thread.currentThread().getName() + " waiting...");
					goods.wait();
				}

				System.out.println(Thread.currentThread().getName() + " producing " + productId);
				goods.addLast(productId++);

				System.out.println(goods);

				goods.notify();
				Thread.sleep(rand.nextInt(PAUSE_AFTER_EACH_OP) + PAUSE_AFTER_EACH_OP);
			}
			Thread.sleep(rand.nextInt(100));
		}
	}

	public void consume() throws InterruptedException {
		// TODO
		while (true) {
			synchronized (goods) {
				while (goods.isEmpty()) {
					System.out.println(Thread.currentThread().getName() + " waiting...");
					goods.wait();
				}

				System.out.println(Thread.currentThread().getName() + " consuming " + goods.pollFirst());

				System.out.println(goods);

				goods.notify();
				Thread.sleep(rand.nextInt(PAUSE_AFTER_EACH_OP) + PAUSE_AFTER_EACH_OP);
			}
			Thread.sleep(rand.nextInt(100));
		}
	}

}