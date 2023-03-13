package practicalworks;

import java.util.Scanner;

public class SubstringOccurrences {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine();

		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			for (int j = i + 1; j <= str1.length(); j++) {
				String substr1 = str1.substring(i, j);
				if (str2.length() >= j && substr1.equals(str2.substring(i, j))) {
					count++;
					System.out.println(substr1);
				}
			}
		}

		System.out.println("Number of substrings: " + count);
	}
}
