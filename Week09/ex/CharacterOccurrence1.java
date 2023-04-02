import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class CharacterOccurrence1 {
    public static void main(String[] args) {

      CharacterCount(args[0]);
       // CharacterCount(str);

    }

    static void CharacterCount(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();

        char[] strArray = str.toCharArray();

        for(char c : strArray) {
            if (hm.containsKey(c))
            hm.put(c, hm.get(c) + 1);
            //hm.put(c, strArray.charAt(c));
            else 
                hm.put(c, 1);
            
        }

        for(Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
