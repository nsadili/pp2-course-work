

import java.util.Arrays;

public class CharacterOccurences {
    public static void main(String[] args) {       
        String str = args[0];
        System.out.println("String: " + str);
        
        System.out.println("Characters and indexes in non-descending order:");
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (char c : chars) {
            int index = str.indexOf(c);
            System.out.println(c + " - " + index);
        }
        
        System.out.println("Characters and indexes in non-ascending order:");
        chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            char c = chars[i];
            int index = str.indexOf(c);
            System.out.println(c + " - " + index);
        }
    }
}