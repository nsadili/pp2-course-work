import java.util.HashMap;
import java.util.Map;

public class StringCache {

    private Map<String, Character[]> cache = new HashMap<>();

    public Character[] getMostAndLeastFrequentChars(String input) {
        if (cache.containsKey(input)) {
            System.out.println("Using cached result for " + input);
            return cache.get(input);
        } else {
            Character[] result = new Character[2];
            int[] charCounts = new int[256];
            for (int i = 0; i < input.length(); i++) {
                charCounts[input.charAt(i)]++;
            }
            int maxCount = 0, minCount = Integer.MAX_VALUE;
            char maxChar = ' ', minChar = ' ';
            for (int i = 0; i < charCounts.length; i++) {
                if (charCounts[i] > 0) {
                    char c = (char) i;
                    if (charCounts[i] > maxCount) {
                        maxCount = charCounts[i];
                        maxChar = c;
                    }
                    if (charCounts[i] < minCount) {
                        minCount = charCounts[i];
                        minChar = c;
                    }
                }
            }
            result[0] = maxChar;
            result[1] = minChar;
            cache.put(input, result);
            return result;
        }
    }

    public static void main(String[] args) {
        StringCache stringCache = new StringCache();
        String input = "This is an example sentence.";
        Character[] result = stringCache.getMostAndLeastFrequentChars(input);
        System.out.println("Most frequent character of " + input + " is " + result[0]);
        System.out.println("Least frequent character of " + input + " is " + result[1]);
        result = stringCache.getMostAndLeastFrequentChars(input);
        System.out.println("Most frequent character of " + input + " is " + result[0]);
        System.out.println("Least frequent character of " + input + " is " + result[1]);
    }
}
