import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ex7 {
    public static void main(String[] args) {
        String word="Alphabetically";
        word=word.toLowerCase();
        mostAndLeastFrequentCharacters(word);
        
    }
    public static void mostAndLeastFrequentCharacters(String input) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (charFrequencyMap.containsKey(ch)) {
                charFrequencyMap.put(ch, charFrequencyMap.get(ch) + 1);
            } else {
                charFrequencyMap.put(ch, 1);
            }
        }
        int maxFrequency = Collections.max(charFrequencyMap.values());
        int minFrequency = Collections.min(charFrequencyMap.values());
        Map<Character, Integer> result = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                System.out.println("Most frequent character: "+ entry.getKey());
            } else if (entry.getValue() == minFrequency) {
              System.out.println("Least frequent character: "+entry.getKey());
            }
        }
    }
}
