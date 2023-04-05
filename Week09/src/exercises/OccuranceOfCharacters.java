package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class OccuranceOfCharacters {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		TreeMap<Character, List<Integer>> charIndexMap = new TreeMap<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			List<Integer> indexList = charIndexMap.getOrDefault(c, new ArrayList<>());
			indexList.add(i);
			charIndexMap.put(c, indexList);
		}

		System.out.println("Characters and their indexes in non-descending order:");
		
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
