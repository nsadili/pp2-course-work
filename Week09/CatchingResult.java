package Week09;
import java.util.HashMap;
import java.util.Map;
public class CatchingResult {
        private static Map<String, String> cache = new HashMap<>();
        public static String getFrequentCharacters(String inputString) {
            if (cache.containsKey(inputString)) {
                System.out.println("Result for \"" + inputString + "\" found in cache.");
                return cache.get(inputString);
            }
            Map<Character, Integer> frequencyMap = new HashMap<>();
            for (int i = 0; i < inputString.length(); i++) {
                char c = inputString.charAt(i);
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
            char mostFrequentChar = '\0';
            char leastFrequentChar = '\0';
            int maxFrequency = Integer.MIN_VALUE;
            int minFrequency = Integer.MAX_VALUE;
            for (char c : frequencyMap.keySet()) {
                int frequency = frequencyMap.get(c);
                if (frequency > maxFrequency) {
                    maxFrequency = frequency;
                    mostFrequentChar = c;
                }
                if (frequency < minFrequency) {
                    minFrequency = frequency;
                    leastFrequentChar = c;
                }
            }
            String result = "Most frequent character: " + mostFrequentChar +
                    ", Least frequent character: " + leastFrequentChar;
            cache.put(inputString, result);
            return result;
        }
    }
