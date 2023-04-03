import java.util.HashMap;
import java.util.Map;

public class CharFrequencyCache {
    private static Map<String, Character[]> cache = new HashMap<>();

    public static Character[] findMostAndLeastFrequentChars(String input) {e
        if (cache.containsKey(input)) {
            System.out.println("Result in catch");
            return cache.get(input);
        }

        Map<Character, Integer> freqMap = new HashMap<>();
        int maxCount = 0, minCount = Integer.MAX_VALUE;
        char mostFreqChar = '\0', leastFreqChar = '\0';
        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            int count = freqMap.get(c);
            if (count > maxCount) {
                maxCount = count;
                mostFreqChar = c;
            }
            if (count < minCount) {
                minCount = count;
                leastFreqChar = c;
            }
        }

        Character[] result = {mostFreqChar, leastFreqChar};
        cache.put(input, result);

        System.out.println("Not found");
        return result;
    }

    public static void main(String[] args) {
        String input1 = "Good morning";
        String input2 = "Good afternoon;
        String input3 = "Good evening";
        Character[] result1 = findMostAndLeastFrequentChars(input1);
        Character[] result2 = findMostAndLeastFrequentChars(input2);
        Character[] result3 = findMostAndLeastFrequentChars(input3);
        System.out.println(input1 + result1[0] + result1[1]);
        System.out.println(input2 + result2[0] + result2[1]);
        System.out.println(input3 + result3[0] + result3[1]);
        Character[] result4 = findMostAndLeastFrequentChars(input1);
        System.out.println(input1 + result4[0] + result4[1]);
    }
}