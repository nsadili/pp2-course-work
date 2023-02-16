package practicalworks;

import java.util.Arrays;

public class AnagramChecker {
	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "world";
		boolean result = isAnagram(str1, str2);
		System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? ");
		System.out.println("result: " + result);
		
		String str3 = "zakir";
		String str4 = "rikaz";
		boolean result1 = isAnagram(str3, str4);
		System.out.println("Are \"" + str3 + "\" and \"" + str4 + "\" anagrams? ");
		System.out.println("result: " + result1);

	}

	public static boolean isAnagram(String str1, String str2) {
		str1 = str1.toLowerCase().replaceAll("[^a-z0-9]", "");
		str2 = str2.toLowerCase().replaceAll("[^a-z0-9]", "");

		char[] str1Sorted = str1.toCharArray();
		Arrays.sort(str1Sorted);
		char[] str2Sorted = str2.toCharArray();
		Arrays.sort(str2Sorted);

		return Arrays.equals(str1Sorted, str2Sorted);
	}
}
