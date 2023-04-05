package CachingResults;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String input = s.nextLine();
            System.out.println(findMostAndLeastFrequentCharacters(input));
        }

    }

    public static char[] findMostAndLeastFrequentCharacters(String str) {
        Map<Character, Integer> charFreq = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int freq = charFreq.getOrDefault(c, 0);
            charFreq.put(c, freq + 1);
        }

        char mostFreq = ' ';
        char leastFreq = ' ';
        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;
        for (char c : charFreq.keySet()) {
            int freq = charFreq.get(c);
            if (freq > maxFreq) {
                maxFreq = freq;
                mostFreq = c;
            }
            if (freq < minFreq) {
                minFreq = freq;
                leastFreq = c;
            }
        }

        char[] result = { mostFreq, leastFreq };
        return result;
    }

}
