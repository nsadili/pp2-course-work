package Week07;

import java.util.Scanner;

public class LetterCounter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] counts = null;
		String word;

		do {
			counts = new int[26];
			System.out.print("Enter a word (0 to exit): ");
			word = scanner.nextLine();

			word = word.toLowerCase();

			if (word.trim().equals("0"))
				break;

			try {
				for (int i = 0; i < word.length(); i++)
					counts[word.charAt(i) - 'a']++;
			} catch (ArrayIndexOutOfBoundsException exception) {
				System.out.printf("Invalid word: %s\n", word);
				continue;
			}

			System.out.println("\nLetter counts:");

			for (int i = 0; i < counts.length; i++)
				if (counts[i] != 0)
					System.out.println((char) (i + 'a') + ": " + counts[i]);

			System.out.println();
		} while (true);

		scanner.close();
	}
}
