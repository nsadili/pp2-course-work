import java.util.Scanner;

public class StringReverse
 {
    public static String reverseString(String input) 
    {
        StringBuilder sb = new StringBuilder();

        for (int i= input.length()- 1; i >= 0 ;  i--)
        {
            sb.append(input.charAt(i));  //charAt Returns the character at given position
        }

        return sb.toString();       
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String reversedString = reverseString(inputString);

        System.out.println(reversedString);
    }

 }

    
   
