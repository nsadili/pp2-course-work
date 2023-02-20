package pp2.week04;
import java.util.*;
public class Substring {
    static int FindSubstring(String s1, String s2)
    {
        int a = s1.length();
        int b = s2.length();
        for (int i = 0; i <= a - b; i++) {
            int j;
            for (j = 0; j < b; j++)
                if (s2.charAt(i + j) != s1.charAt(j))
                   break;
            if (j == b)
                return i;
        }
        return -1;
    }

    public static void main(String args[])
    {
        String s1 = "hello";
        String s2 = "string";

        int res = FindSubstring(s1, s2);

        if (res == -1)
            System.out.println("-1");
        else
            System.out.println(res);
    }

}
