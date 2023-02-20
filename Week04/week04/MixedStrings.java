package pp2.week04;
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
        for (int i = 0; i < arr.length; i++)
        {
            int j = i;
            while (i < arr.length && arr[i] != ' ')
            {
                i++;
            }
            char temp = arr[j];
            arr[j] = arr[i- 1];
            arr[i - 1] = temp;
        }
        return new String(arr);
    }
}
