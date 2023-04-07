package Week009;

import java.util.*;

public class CharacterOccurrences {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = scanner.nextLine();

		TreeMap<Character, List<Integer>> charIndexMap = new TreeMap<>();

		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			List<Integer> indexList = charIndexMap.getOrDefault(a, new ArrayList<>());
			indexList.add(i);
			charIndexMap.put(a, indexList);
		}

		System.out.println("Characters and their indexes is in non-descending order:");
		for (Map.Entry<Character, List<Integer>> entry : charIndexMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		System.out.println("Characters and their indexes in non-ascending order:");
		NavigableMap<Character, List<Integer>> descendingMap = charIndexMap.descendingMap();
		for (Map.Entry<Character, List<Integer>> entry : descendingMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}