package Week09;


import java.util.*;

public class UniqueCharacters {
	private static Map<String, List<Character>> cache = new HashMap<>();

	public static List<Character> getUniqueChars(String a) {
		if (cache.containsKey(a)) {
			System.out.println("Using cached result for string: " + s);
			return cache.get(a);
		}

		Set<Character> uniqueChars = new HashSet<>();
		for (char b : a.toCharArray()) {
			uniqueChars.add(b);
		}

		List<Character> result = new ArrayList<>(uniqueChars);
		Collections.sort(result);

		cache.put(a, result);
		System.out.println("Caching result for string: " + a);
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print(Input a string: ");"
		String a = scanner.nextLine();

		List<Character> uniqueChars = getUniqueChars(a);
		System.out.println("Unique characters of \"" + a + "\": " + uniqueChars);
	}
} {
    
}
