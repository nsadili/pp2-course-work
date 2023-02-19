import java.util.Arrays;
import java.util.Scanner;

public class SortingString {
    public static String sortString(String input) {
        // convert the input string to a char array
        char[] charArray = input.toCharArray();

        // sort the char array 
        Arrays.sort(charArray);

        // the char array becomes a string
        String sortedString = new String(charArray);

        return sortedString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleaase, enter the input: ");
        String input = sc.nextLine();
        sc.close(); 
        String sortedString = sortString(input);

        System.out.println("Alphabetically sorted string: " + sortedString);
    }
}
