package practicalworks;

import java.util.Arrays;

public class SortingStrings {
	public static void main(String[] args) {
		String input = "zakir";
		String sortedString = sortString(input);
		System.out.println(sortedString);
	}
	

	public static String sortString(String input) {
		char[] chars = input.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
}
