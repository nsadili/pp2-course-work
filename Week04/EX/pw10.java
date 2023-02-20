package EX;
import java.util.Arrays;
import java.util.Scanner;

public class pw10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Print the first statement: ");
        String input1 = scan.nextLine();
        System.out.print("Print the second statement: ");
        String input2 = scan.nextLine();
        System.out.printf("Are they anagrams? %s", anagramOrNot(input1, input2) ? "YES\n" : "NO\n");
        scan.close();
    }

    public static boolean anagramOrNot(String input1, String input2){
        input1 = input1.replaceAll("\\s", "").toLowerCase();
        input2 = input2.replaceAll("\\s", "").toLowerCase();
        if (input1.length() != input1.length()) {
            return false;
        }
        char[] char1 = input1.toCharArray();
        char[] char2 = input2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1, char2);
    }
}
