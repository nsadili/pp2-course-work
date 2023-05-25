
package problem4;

public class Main {
	public static void main(String[] args) {
		Stock stock = new Stock(5);

		Producer prd1 = new Producer("Shoemaker_1", stock);
		Producer prd2 = new Producer("Shoemaker_2", stock);
		Producer prd3 = new Producer("Shoemaker_3", stock);
		Consumer con1 = new Consumer("Person1", stock);
		Consumer con2 = new Consumer("Person2", stock);

		// prd1.setPriority(7);
		// con1.setPriority(8);

		prd1.start();
		con1.start();
		prd2.start();
		prd3.start();
		con2.start();

		try {
			prd1.join();
			prd2.join();
			prd3.join();
			con1.join();
			con2.join();
		} catch (InterruptedException iex) {
			// swallow exception
		}
	}
}