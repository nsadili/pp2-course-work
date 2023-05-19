package Week13.problem1.single;

import java.util.StringTokenizer;

public class SingleProcessor {
	String text;

	public SingleProcessor(String text) {
		this.text = text;
	}

	public int count() {
		int count = 0;
		StringTokenizer st = new StringTokenizer(text);

		while (st.hasMoreTokens()) {
			String word = st.nextToken();
			if (word.length() > 3) {
				count++;
			}
		}
		return count;
	}
}
