package Week09;

import java.util.*;

public class CachingResults {

    private static Map<String, Map> cache = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println(mostLeastFrequent(input));
        /*System.out.println(mostLeastFrequent(input)); If we delete comment signs from this line
        then it will return the result the same but use cache this time because the given input is
        the same with the previous one, and we already have it in cache.
        */
    }

    private static Map<String, Character> mostLeastFrequent(String string) {
        if (cache.containsKey(string)) {
            System.out.println("Getting the result from cache");
            return cache.get(string);
        }

        Map<Character, Integer> characterFrequency = new HashMap<>();
        for (Character character : string.toCharArray()) {
            characterFrequency.put(character, characterFrequency.getOrDefault(character, 0) + 1);
        }

        Map.Entry<Character, Integer> max = null;
        Map.Entry<Character, Integer> min = null;
        for (Map.Entry<Character, Integer> entry : characterFrequency.entrySet()) {
            if (max == null || entry.getValue() > max.getValue())
                max = entry;
            if (min == null || entry.getValue() < min.getValue())
                min = entry;
        }

        Map<String, Character> result = new LinkedHashMap<>();
        result.put("Most frequent character in the string: ", max.getKey());
        result.put("Least frequent character in the string: ", min.getKey());

        cache.put(string, result);
        return result;
    }
}
