import java.util.Scanner;
import java.util.Arrays;

public class SortingStrings
{
    public static String sortString(String input)
    {
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray); // Arrays.sort() method sorts the character array in ascending order

        return new String(charArray);

        //could be done with checking by indexes wheter the represented index's charachter greater than other's or not
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String sorted = sortString(input);
        System.out.println("Sorted string: " + sorted);

    }



}