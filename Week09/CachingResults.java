package Week09;
import java.util.HashMap;
import java.util.Map;

public class CachingResults {
    private static Map<String, Result> cache = new HashMap<>();

    public static class Result {
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

    public static Result findMostAndLeastFrequentChars(String input) {
        if (cache.containsKey(input)) {
            return cache.get(input);
        }

       
        int[] charCount = new int[256];  

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCount[c]++;
        }

        char mostFrequent = '\0';
        char leastFrequent = '\0';
        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                if (charCount[i] > maxFrequency) {
                    maxFrequency = charCount[i];
                    mostFrequent = (char) i;
                }
                if (charCount[i] < minFrequency) {
                    minFrequency = charCount[i];
                    leastFrequent = (char) i;
                }
            }
        }

        Result result = new Result(mostFrequent, leastFrequent);

       
        cache.put(input, result);

        return result;
    }

    public static void main(String[] args) {
        String input = "Hello, World!";

        Result result1 = findMostAndLeastFrequentChars(input);
        System.out.println("Most frequent character: " + result1.getMostFrequent());
        System.out.println("Least frequent character: " + result1.getLeastFrequent());

       
        Result result2 = findMostAndLeastFrequentChars(input);
        System.out.println("Most frequent character (cached): " + result2.getMostFrequent());
        System.out.println("Least frequent character (cached): " + result2.getLeastFrequent());
    }
}


