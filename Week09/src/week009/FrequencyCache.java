package week009;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCache {
	private Map<String, Character[]> cache = new HashMap<>();

	public Character[] getFrequencies(String str) {
		if (cache.containsKey(str)) {
			System.out.println("Retrieving frequencies from cache for string: " + str);
			return cache.get(str);
		}

		Map<Character, Integer> freqMap = new HashMap<>();

		for (char c : str.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}

		char mostFreqChar = '\0';
		int mostFreqCount = 0;
		char leastFreqChar = '\0';
		int leastFreqCount = Integer.MAX_VALUE;

		for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
			char c = entry.getKey();
			int count = entry.getValue();

			if (count > mostFreqCount) {
				mostFreqChar = c;
				mostFreqCount = count;
			}

			if (count < leastFreqCount) {
				leastFreqChar = c;
				leastFreqCount = count;
			}
		}

		Character[] frequencies = new Character[] { mostFreqChar, leastFreqChar };
		cache.put(str, frequencies);
		System.out.println("Calculating frequencies for string: " + str);
		return frequencies;
	}

	public static void main(String[] args) {
		FrequencyCache frequencyCache = new FrequencyCache();

		Character[] frequencies1 = frequencyCache.getFrequencies
				("hello world olympic");
		System.out.println(
				"Most frequent character: " + frequencies1[0] + ", Least frequent character: " + frequencies1[1]);

		Character[] frequencies2 = frequencyCache.getFrequencies
				("Also it is easy to learn it");
		System.out.println(
				"Most frequent character: " + frequencies2[0] + ", Least frequent character: " + frequencies2[1]);
	}
}
