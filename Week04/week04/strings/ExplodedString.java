package pp2.week04.strings;
import java.util.*;
public class ExplodedString
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print(ExplodedString(scn.nextLine()));
    }
    public static String ExplodedString(String string)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= string.length(); i++)
            sb.append(string.substring(0, i));
        return sb.toString();
    }
}