package pp2.week04.strings;
import java.util.*;
public class Anagrams { public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        char[] str1 = scn.nextLine().toCharArray();
        char[] str2 = scn.nextLine().toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if (Arrays.equals(str1, str2))
            System.out.println("True");
        else
            System.out.println("False");
    }
}

