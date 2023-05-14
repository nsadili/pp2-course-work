package Week13.problem3;



public class Reader extends Thread {

	private Counter counter;
	private int nbReads;

	public Reader(Counter counter, int N) {
		this.counter = counter;
		this.nbReads = N;
	}

	public void run() {
		for (int i = 0; i < nbReads; i++) {
			try {
				counter.getValue();
				// Thread.sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}