package Week04.pw11;

import java.util.Scanner;

public class MixedStrings {
    static String mixedStrings(String str){
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 1) {
                // Swap the first and last characters
                char firstchr = word.charAt(0);
                char lastchr = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);
                String swappedWord = lastchr + middle + firstchr;
                result.append(swappedWord).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scan.nextLine();
        scan.close();
        System.out.printf("Mixed string: %s\n", mixedStrings(str));
    }
}
