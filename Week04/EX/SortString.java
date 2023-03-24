import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String output = sortString(input);
        System.out.println(output);
        scanner.close();
    }

    public static String sortString(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[j] < charArray[minIndex]) {
                    minIndex = j;
                }
            }
            char temp = charArray[i];
            charArray[i] = charArray[minIndex];
            charArray[minIndex] = temp;
        }
        return new String(charArray);
    }
}
