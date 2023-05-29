class Producer extends Thread {

	private Stock stock;

	public Producer(String name, Stock stock) {
		super(name);
		this.stock = stock;
	}

	public void run() {
		try {
			stock.produce();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}