package PW;

import java.util.Comparator;
import java.util.TreeMap;

public class CharacterOccurrences {
    public static void main(String[] args){
        //alphabetically ascending order
        TreeMap<String, Integer> chars = new TreeMap<>(new Comparator<String>() {
            public int compare(String key1, String key2){
                return key2.compareTo(key1);
            }
        });

        for(int i=0;i<args[0].length();i++){
            chars.put(Character.toString(args[0].charAt(i)), i);
        }

        System.out.println(chars);

        //alphabetically descending order
        chars = new TreeMap<>(new Comparator<String>() {
            public int compare(String key1, String key2){
                return key1.compareTo(key2);
            }
        });

        for(int i=0;i<args[0].length();i++){
            chars.put(Character.toString(args[0].charAt(i)), i);
        }

        System.out.println(chars);
    }
}
