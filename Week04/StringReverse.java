import java.util.Scanner;

public class StringReverse
 {
    public static String reverseString(String input) 
    {
        StringBuilder reversed = new StringBuilder();

        for (int i= 0; input.length()- 1; i >= 0 ;  i--)
        {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();

       
    }

 }