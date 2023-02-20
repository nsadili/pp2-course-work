package week4;
import java.util.Scanner;
class mixedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] words = string.split("\\s+"); // split by one or more whitespace characters

        for (String word : words) {
            char[] characters = word.toCharArray();
            if (characters.length >= 2) {
                char temp = characters[0];
                characters[0] = characters[characters.length - 1];
                characters[characters.length - 1] = temp;
            }
            String newWord = new String(characters);
            System.out.print(newWord + " ");
        }
    }
}
