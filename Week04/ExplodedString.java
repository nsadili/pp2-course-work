import java.util.Scanner;

public class ExplodedString
{
    public static String explodeString(String input)
    {
        StringBuilder sb = new StringBuilder();

        for (int i= 1; i <= input.length() ;  i++)
        {
            sb.append(input.substring(0, i));  //substring Returns the character at given position
        }

        return sb.toString();
        
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String exploded = explodeString(input);
        System.out.println("Exploded string: " + exploded);
    }
}