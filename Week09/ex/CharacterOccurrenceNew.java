package Week09.ex;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharacterOccurrenceNew {
    public static void main(String[] args) {
      CharacterCount(args[0]);
    }

    static void CharacterCount(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] strArray = str.toCharArray();
        for(char c : strArray) {
            if (hm.containsKey(c))
            hm.put(c, hm.get(c) + 1);
            else 
                hm.put(c, 1);
        }
        for(Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + ":  " + entry.getValue());
        }
    }
}
