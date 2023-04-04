import java.util.HashMap;
import java.util.Map;

public class Exercise_7 {
    
    private static Map<String, char[]> cache = new HashMap<>();
    
    public static char[] analyzeString(String input) {
        if (cache.containsKey(input)) {
            System.out.println("Using cached result for input: " + input);
            return cache.get(input);
        }
        
        char[] charArray = input.toCharArray();
        int[] frequencies = new int[256];
        
        for (char c : charArray) {
            frequencies[c]++;
        }
        
        char mostFrequent = charArray[0];
        char leastFrequent = charArray[0];
        
        for (int i = 1; i < charArray.length; i++) {
            if (frequencies[charArray[i]] > frequencies[mostFrequent]) {
                mostFrequent = charArray[i];
            }
            if (frequencies[charArray[i]] < frequencies[leastFrequent]) {
                leastFrequent = charArray[i];
            }
        }
        
        char[] result = {mostFrequent, leastFrequent};
        cache.put(input, result);
        return result;
    }
    
    public static void main(String[] args) {
        String input = "Hello, World!";
        char[] result = analyzeString(input);
        System.out.println("Input: " + input);
        System.out.println("Most frequent character: " + result[0]);
        System.out.println("Least frequent character: " + result[1]);
        
        input = "Lorem ipsum dolor sit amet";
        result = analyzeString(input);
        System.out.println("Input: " + input);
        System.out.println("Most frequent character: " + result[0]);
        System.out.println("Least frequent character: " + result[1]);
        
        // Try calling analyzeString with the same input multiple times
        result = analyzeString("Hello, World!");
        System.out.println("Most frequent character: " + result[0]);
        System.out.println("Least frequent character: " + result[1]);
    }
}
