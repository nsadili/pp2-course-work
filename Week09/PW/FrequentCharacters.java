import java.util.*;

public class FrequentCharacters {
    private static final Map<String, Result> cache = new HashMap<>();

    private static class Result {
        char mostFrequent;
        char leastFrequent;

        public Result(char mostFrequent, char leastFrequent) {
            this.mostFrequent = mostFrequent;
            this.leastFrequent = leastFrequent;
        }
    }

    public static Result findFrequentCharacters(String input) {
        if (cache.containsKey(input)) {
            return cache.get(input);
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = '\0';
        char leastFrequent = '\0';
        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequent = entry.getKey();
            }

            if (entry.getValue() < minFrequency) {
                minFrequency = entry.getValue();
                leastFrequent = entry.getKey();
            }
        }

        Result result = new Result(mostFrequent, leastFrequent);
        cache.put(input, result);

        return result;
    }

    public static void main(String[] args) {
        String input = "hi my name is amal";
        Result result = findFrequentCharacters(input);
        System.out.println("Most frequent character: " + result.mostFrequent);
        System.out.println("Least frequent character: " + result.leastFrequent);

        // Calling the method again with the same input will use the cached result
        Result cachedResult = findFrequentCharacters(input);
        System.out.println("Most frequent character (cached): " + cachedResult.mostFrequent);
        System.out.println("Least frequent character (cached): " + cachedResult.leastFrequent);
    }
}