package Week04.pw;

import java.util.*;
public class Anagram
{
    public static void main(String[] args)
    {
        Scanner task = new Scanner(System.in);
        char[] a = task.nextLine().toCharArray();
        char[] b = task.nextLine().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b))
            System.out.println("true");
        else
            System.out.println("false");

    }
}