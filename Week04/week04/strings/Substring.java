package pp2.week04.strings;
import java.util.*;
public class Substring {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        int res = FindSubstring(str1, str2);
        if (res == -1)
            System.out.println("-1");
        else
            System.out.println(res);
    }
    static int FindSubstring(String str1, String str2)
    {
    return str1.indexOf(str2);
    }
}