package ex;

import java.util.Arrays;

public class SortingStrings {
    public static String sortString(String input) {
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
   }
   public class Main {
    public static void main(String[] args) {
        String input = "hello world";
        System.out.println(SortingStrings.sortString(input)); 
    }
}
}
