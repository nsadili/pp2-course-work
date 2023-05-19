package Week13.problem3;

public class Counter {

	private int count = 0;
	private boolean isModified = false;

	public synchronized void increment() throws InterruptedException {
		if (isModified)
			wait();

		count++;
		System.out.println("Incremented: " + count);

		isModified = true;
		notify();
	}

	public synchronized int getValue() throws InterruptedException {
		if (!isModified)
			wait();

		System.out.println("Get: " + count);

		isModified = false;
		notify();

		return count;
	}
}
