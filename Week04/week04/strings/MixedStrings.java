package pp2.week04.strings;
import java.util.*;
public class MixedStrings {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println(swap(scn.nextLine()));
    }
    static String swap(String str)
    {
        char[] arr = str.toCharArray();
        for (int lastchar = 0; lastchar < arr.length; lastchar++)
        {
            int firstchar = lastchar;
            while (lastchar < arr.length && arr[lastchar] != ' ')
            {
                lastchar++;
            }
            char temp = arr[firstchar];
            arr[firstchar] = arr[lastchar - 1];
            arr[lastchar - 1] = temp;
        }
        return new String(arr);
    }
}

