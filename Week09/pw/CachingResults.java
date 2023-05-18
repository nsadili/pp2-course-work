import java.util.HashMap;
import java.util.Map;

public class CachingResults {
    private static Map<String, Result> cache = new HashMap<>();

    public static void main(String[] args) {
        String input = "Hello World";

        Result result = getMostAndLeastFrequentCharacters(input);
        System.out.println("Most frequent character: " + result.getMostFrequent());
        System.out.println("Least frequent character: " + result.getLeastFrequent());
        
        Result cachedResult = getMostAndLeastFrequentCharacters(input);
        System.out.println("Most frequent character (from cache): " + cachedResult.getMostFrequent());
        System.out.println("Least frequent character (from cache): " + cachedResult.getLeastFrequent());
    }

    public static Result getMostAndLeastFrequentCharacters(String input) {
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
            char character = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                mostFrequent = character;
                maxFrequency = frequency;
            }

            if (frequency < minFrequency) {
                leastFrequent = character;
                minFrequency = frequency;
            }
        }

        
        Result result = new Result(mostFrequent, leastFrequent);

       
        cache.put(input, result);

        return result;
    }

    private static class Result {
        private char mostFrequent;
        private char leastFrequent;

        public Result(char mostFrequent, char leastFrequent) {
            this.mostFrequent = mostFrequent;
            this.leastFrequent = leastFrequent;
        }

        public char getMostFrequent() {
            return mostFrequent;
        }

        public char getLeastFrequent() {
            return leastFrequent;
        }
    }
}
