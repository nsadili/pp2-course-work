package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
	
	private static Map<String, List<Character>> cache = new HashMap<>();

	public static List<Character> getUniqueChars(String s) {
		
		if (cache.containsKey(s)) {
			System.out.println("Using cached result for string: " + s);
			return cache.get(s);
		}

		Set<Character> uniqueChars = new HashSet<>();
		
		for (char c : s.toCharArray()) {
			uniqueChars.add(c);
		}

		List<Character> result = new ArrayList<>(uniqueChars);
		Collections.sort(result);

		cache.put(s, result);
		
		System.out.println("Caching result for string: " + s);
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = sc.nextLine();

		List<Character> uniqueChars = getUniqueChars(s);
		
		System.out.println("Unique characters of \"" + s + "\": " + uniqueChars);
	}
}
