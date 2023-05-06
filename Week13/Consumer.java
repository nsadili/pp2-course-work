package Week13;

class Consumer extends Thread {
	private Stock stock;

	public Consumer(String name, Stock stock) {
		super(name);
		this.stock = stock;
	}

	public void run() {
		try {
			stock.consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
