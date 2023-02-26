package practicalwork;

import java.util.Scanner;

public class OccurencesOfString {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Please enter the first string: ");
		
		String str1 = scn.nextLine();
		
		System.out.print("Please enter the second string: ");
		
		String str2 = scn.nextLine();

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