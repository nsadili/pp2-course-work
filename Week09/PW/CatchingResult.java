package Week09.PW;

import java.util.HashMap;
import java.util.Map;

public class CatchingResult {
    private static Map<String, Result> cache = new HashMap<>();

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }

        String input = args[0];
        Result result = getCharacterOccurrences(input);
        System.out.println("Most frequent character: " + result.mostFrequent);
        System.out.println("Least frequent character: " + result.leastFrequent);
    }

    public static Result getCharacterOccurrences(String input) {
        if (cache.containsKey(input)) {
            System.out.println("Using cached result for input: " + input);
            return cache.get(input);
        }

        int[] frequencies = new int[256]; 

       
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            frequencies[ch]++;
        }


        char mostFrequent = '\0';
        char leastFrequent = '\0';
        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;

        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > maxFrequency) {
                mostFrequent = (char) i;
                maxFrequency = frequencies[i];
            }
            if (frequencies[i] < minFrequency && frequencies[i] > 0) {
                leastFrequent = (char) i;
                minFrequency = frequencies[i];
            }
        }

        Result result = new Result(mostFrequent, leastFrequent);
        cache.put(input, result);
        return result;
    }

    static class Result {
        char mostFrequent;
        char leastFrequent;

        Result(char mostFrequent, char leastFrequent) {
            this.mostFrequent = mostFrequent;
            this.leastFrequent = leastFrequent;
        }
    }
}
