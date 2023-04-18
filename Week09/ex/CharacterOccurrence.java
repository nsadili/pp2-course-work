package Week09.ex;

import java.util.HashMap;
import java.util.Iterator;

public class CharacterOccurrence {
    public static void main(String[] args) {

      CharacterCount(args[0]);

    }
    static void CharacterCount(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] strArray = str.toCharArray();

        Iterator it = hm.keySet().iterator();
        while(it.hasNext()) {
            for(int i = 0; i < hm.size(); i++)
            hm.put(str.charAt(strArray[i]), i);
        }

        for(char c : strArray) {
            if (hm.containsKey(c))
            for(int i = 0; i < hm.size(); i++)
            hm.put(str.charAt(strArray[i]), i);
        }
        System.out.println(hm);
    }
}