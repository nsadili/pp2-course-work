package Week09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CharacterOccurances {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Kindly input a single string as a command line argument.");
            return;
        }

        String inputString = args[0];
        List<Character> charList = new ArrayList<Character>();

        for(int i = 0; i < inputString.length(); i++)
        {
            charList.add(inputString.charAt(i));
        }
    
        System.out.println(charList);

        Comparator<Character> comp = new Comparator<Character>() {
            public int compare(Character c1, Character c2) {
                return (c1 > c2) ? 1 : -1;
            }
        };

        Comparator<Character> comp2 = new Comparator<Character>() {
            public int compare(Character c1, Character c2) {
                return (c1 < c2) ? 1 : -1;
            }
        };

        Collections.sort(charList, comp);
        System.out.println(charList);

        Collections.sort(charList, comp2);
        System.out.println(charList);

    }
}