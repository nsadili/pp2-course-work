package Week04;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s = "bakuu"; 
        char[] c = s.toCharArray();

        String s2 = "aukbu";
        char[] c2 = s2.toCharArray();

        Arrays.sort(c);
        Arrays.sort(c2);

        boolean x = Arrays.equals(c, c2);
        System.out.println(x); 
    }
}

