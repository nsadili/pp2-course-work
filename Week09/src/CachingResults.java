import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CachingResults {
    private Map<String, char[]> cache;

    public CachingResults() {
        this.cache = new HashMap<>();
    }

    public char[] getMostAndLeastFrequentChars(String str) {
        if (cache.containsKey(str)) {
            System.out.println("Retrieving result from cache...");
            return cache.get(str);
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();
        char[] chars = str.toCharArray();

        for (char c : chars) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = '\0';
        char leastFrequent = '\0';
        int mostFrequency = Integer.MIN_VALUE;
        int leastFrequency = Integer.MAX_VALUE;

        for (char c : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(c);

            if (frequency > mostFrequency) {
                mostFrequent = c;
                mostFrequency = frequency;
            }

            if (frequency < leastFrequency) {
                leastFrequent = c;
                leastFrequency = frequency;
            }
        }

        char[] result = { mostFrequent, leastFrequent };
        cache.put(str, result);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CachingResults cache = new CachingResults();
        String str = sc.nextLine();

        char[] result1 = cache.getMostAndLeastFrequentChars(str);
        System.out.println("Most frequent char: " + result1[0]);
        System.out.println("Least frequent char: " + result1[1]);

        char[] result2 = cache.getMostAndLeastFrequentChars(str);
        System.out.println("Most frequent char: " + result2[0]);
        System.out.println("Least frequent char: " + result2[1]);
    }
}
