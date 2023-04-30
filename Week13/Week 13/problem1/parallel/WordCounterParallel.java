package problem1.parallel;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;

public class WordCounterParallel {
	public static void main(String[] args) {
		List<ParallelProcessor> list = new ArrayList<ParallelProcessor>();
		File file = new File("data/text.txt");
		System.out.println(file.getAbsolutePath());

		String text = "";
		String temp = null;
		int lineIdx = 1;
		long start = // System.nanoTime();
				System.currentTimeMillis();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			while ((temp = br.readLine()) != null) {
				text += temp;

				if (lineIdx++ == 200) {
					lineIdx = 1;

					String input = new String(text);
					ParallelProcessor pp = new ParallelProcessor(input);
					pp.start();
					list.add(pp);
					text = "";
				}
			}
			if (text.length() > 0) {
				String input = new String(text);
				ParallelProcessor pp = new ParallelProcessor(input);
				pp.start();
				list.add(pp);
			}

			for (ParallelProcessor p : list) {
				p.join();
			}

			System.out.println("Count: " + FileCount.globalCount);
		} catch (Exception ex) {
			// swallowing exceptions
			System.out.println(ex.getMessage());
		}
		long end = // System.nanoTime();
				System.currentTimeMillis();

		System.out.println("Duration: " + (end - start));

	}
}