import java.util.Arrays;
import java.util.Scanner;

public class PW10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String string2 = scanner.nextLine();
        scanner.close();
        System.out.print("Is it an anagram: " + anagram(string1, string2));
    }

    static boolean anagram(String string1, String string2) {
        char[] array1 = new char[string1.length()];
        char[] array2 = new char[string2.length()];
        array1 = string1.toLowerCase().toCharArray();
        array2 = string2.toLowerCase().toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        boolean result = false;
        if (array1.length != array2.length) result = false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) result = true;
        }
        return result;
    }
}
