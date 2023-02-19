package practicalwork;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		String input = "Huseyn";
		
		String sortedString = sortString(input);
		
		System.out.println(sortedString);
	}
	

	public static String sortString(String input) {
		
		char[] chars = input.toCharArray();
		
		Arrays.sort(chars);
		
		return new String(chars);
	}
}