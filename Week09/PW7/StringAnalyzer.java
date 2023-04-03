public class StringAnalyzer {

    private Map<String, Pair<Character, Character>> cache = new HashMap<>();

    public Pair<Character, Character> analyzeString(String input) {
         if (cache.containsKey(input)) {
            System.out.println("Result for string '" + input + "' found in cache.");
            return cache.get(input);
        }

         Map<Character, Integer> charCounts = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!charCounts.containsKey(c)) {
                charCounts.put(c, 0);
            }
            charCounts.put(c, charCounts.get(c) + 1);
        }

        char mostFreq = '\0';
        char leastFreq = '\0';
        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount) {
                mostFreq = c;
                maxCount = count;
            }
            if (count < minCount) {
                leastFreq = c;
                minCount = count;
            }
        }

        Pair<Character, Character> result = new Pair<>(mostFreq, leastFreq);

        // Cache the result for future use
        cache.put(input, result);
        System.out.println("Result for string '" + input + "' added to cache.");

        return result;
    }
}
