package pp2.week04;
import java.util.*;
public class ExplodedString {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print(ExplodedString(scn.nextLine()));
    }
    public static String ExplodedString(String s)
    {
        StringBuilder strbuild = new StringBuilder();
        for (int i = 0; i <= s.length(); i++)
            strbuild.append(s.substring(0, i));
        return strbuild.toString();
    }
}
