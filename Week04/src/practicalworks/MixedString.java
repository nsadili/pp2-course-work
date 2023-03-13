package practicalworks;

import java.util.Scanner;

public class MixedString {
	public static String swapFirstLast(String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			if (word.length() > 1) {
				char firstChar = word.charAt(0);
				char lastChar = word.charAt(word.length() - 1);
				String swappedWord = lastChar + word.substring(1, word.length() - 1) + firstChar;
				sb.append(swappedWord).append(" ");
			} else {
				sb.append(word).append(" ");
			}
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = scanner.nextLine();
		String newSentence = swapFirstLast(sentence);
		System.out.println("Swapped sentence: " + newSentence);
	}
}
