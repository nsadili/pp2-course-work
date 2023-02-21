package Week04.ex09;

import java.util.Arrays;
import java.util.Scanner;

public class SortingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        String sortedVersion = sortString(inputString);
        System.out.println("The sorted version of the " + inputString + " is: " + sortedVersion);
        sc.close();
    }

    public static String sortString (String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }
}
