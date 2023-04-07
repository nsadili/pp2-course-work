import java.util.*;

public class CachingRes {
    private static Map<String, Map<Character, Integer>> cache = new HashMap<>();
    
    public static Map.Entry<Character, Integer>[] findMostAndLeastFrequentChars(String input) {
        Map<Character, Integer> freqMap;
        if (cache.containsKey(input)) {
            freqMap = cache.get(input);
        } else {
            freqMap = new HashMap<>();
            for (char c : input.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
            cache.put(input, freqMap);
        }
        Map.Entry<Character, Integer>[] sortedEntriesAsc = freqMap.entrySet().toArray(new Map.Entry[freqMap.size()]);
        Arrays.sort(sortedEntriesAsc, Comparator.comparingInt(Map.Entry::getValue));
        Map.Entry<Character, Integer>[] sortedEntriesDesc = sortedEntriesAsc.clone();
        Collections.reverse(Arrays.asList(sortedEntriesDesc));
        Map.Entry<Character, Integer>[] result = new Map.Entry[2];
        result[0] = sortedEntriesDesc[0];
        result[1] = sortedEntriesAsc[0];
        return result;
    }
}
