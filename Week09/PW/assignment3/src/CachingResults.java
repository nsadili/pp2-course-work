import java.util.HashMap;
import java.util.Map;

public class CachingResults {

    private static Map<String, String[]> cache = new HashMap<>();

    public static void main(String[] args) {
        String str = "Hello World!";
        String[] freqChars = getFrequentChars(str);
        System.out.println("Most frequent character: " + freqChars[0]);
        System.out.println("Least frequent character: " + freqChars[1]);
    }

    public static String[] getFrequentChars(String str) {
        if (cache.containsKey(str)) {
            System.out.println("Retrieving result from cache...");
            return cache.get(str);
        }

        Map<Character, Integer> charFreqMap = new HashMap<>();
        char[] charArray = str.toCharArray();

        for (char ch : charArray) {
            charFreqMap.put(ch, charFreqMap.getOrDefault(ch, 0) + 1);
        }

        char mostFreqChar = charArray[0];
        int mostFreqCount = 0;
        char leastFreqChar = charArray[0];
        int leastFreqCount = charArray.length;

        for (char ch : charFreqMap.keySet()) {
            int count = charFreqMap.get(ch);
            if (count > mostFreqCount) {
                mostFreqChar = ch;
                mostFreqCount = count;
            }
            if (count < leastFreqCount) {
                leastFreqChar = ch;
                leastFreqCount = count;
            }
        }

        String[] result = { String.valueOf(mostFreqChar) + "," + mostFreqCount,
                String.valueOf(leastFreqChar) + "," + leastFreqCount };
        cache.put(str, result);
        System.out.println("Adding result to cache...");
        return result;
    }
}