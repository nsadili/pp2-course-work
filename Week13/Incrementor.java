package Week13;

import org.w3c.dom.css.Counter;

public class Incrementor extends Thread {

	private Counter counter;
	private int nbIncrements;

	public Incrementor(Counter counter, int N) {
		this.counter = counter;
		this.nbIncrements = N;
    }

	public void run() {
		for (int i = 0; i < nbIncrements; i++) {
		//	try {
			//	counter.increment();
				// Thread.sleep(0);
		//	} catch (InterruptedException e) {
		//		e.printStackTrace();
		//	}
	//	}
//	}

        }
    }
}
