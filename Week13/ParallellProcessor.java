package Week13;

import java.util.StringTokenizer;

public class ParallellProcessor extends Thread {
	String text;

	public ParallellProcessor(String text) {
		this.text = text;
	}

	// getCount()

	public void run() {
		StringTokenizer st = new StringTokenizer(text);

		while (st.hasMoreTokens()) {
			String word = st.nextToken();
			if (word.length() > 3) {
				//FileCount.increment();
            
			}
		}
	}
}