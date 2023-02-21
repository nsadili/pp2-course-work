package Week04.ex11;

import java.util.Scanner;


public class MixedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        System.out.println("The mixed form of the given sentence \"" + sentence + "\" is: " + swapFirstAndLastChars(sentence));
        sc.close();
    }

    public static String swapFirstAndLastChars(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();
    
        for (String word : words) {
            if (word.length() > 1) {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);
                result.append(lastChar).append(middle).append(firstChar);
            } else {
                result.append(word);
            }
            result.append(" ");
        }
    
        return result.toString();
    }
    
}
