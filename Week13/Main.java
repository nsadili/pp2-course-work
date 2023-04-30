package problem3;

public class Main {

	public static void main(String args[]) {

		Counter cnt = new Counter();

		Incrementor inc = new Incrementor(cnt, 10);
		Reader rd = new Reader(cnt, 10);

		inc.start();
		rd.start();

		try {
			inc.join();
			rd.join();
		} catch (InterruptedException iex) {
		}

	}
}