

import java.util.Arrays;

public class StringSorter {
    public static String sortString(String input) {
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "madina";
        String sortedStr = sortString(str);
        System.out.println(sortedStr); 
    }
}


