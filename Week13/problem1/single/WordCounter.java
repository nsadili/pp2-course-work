package problem1.single;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class WordCounter {
	public static void main(String[] args) {
		File file = new File("data\\text.txt");
		System.out.println(file.getAbsolutePath());

		String text = "";
		String temp = null;
		long start = // System.nanoTime();
				System.currentTimeMillis();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			while ((temp = br.readLine()) != null) {
				text += temp;
			}

			SingleProcessor sp = new SingleProcessor(text);
			int count = sp.count();
			System.out.println("Count: " + count);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		long end = // System.nanoTime();
				System.currentTimeMillis();

		System.out.println("Duration: " + (end - start));

	}
}
