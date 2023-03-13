package practicalworks;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();
		System.out.print("Enter a substring: ");
		String sub = scanner.nextLine();
		int index = findSubstring(str, sub);
		System.out.println("Index of the substring: " + index);
	}

	public static int findSubstring(String str, String sub) {
		if (str == null || sub == null) {
			return -1;
		}

		int strLen = str.length();
		int subLen = sub.length();

		if (subLen > strLen) {
			return -1;
		}

		for (int i = 0; i <= strLen - subLen; i++) {
			int j;
			for (j = 0; j < subLen; j++) {
				if (str.charAt(i + j) != sub.charAt(j)) {
					break;
				}
			}
			if (j == subLen) {
				return i;
			}
		}

		return -1;
	}
}
