import java.util.Scanner;

public class MixedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 1) {
                char firstChar = words[i].charAt(0);
                char lastChar = words[i].charAt(words[i].length() - 1);
                String middleChars = words[i].substring(1, words[i].length() - 1);
                String modifiedWord = lastChar + middleChars + firstChar;
                sb.append(modifiedWord);
            } else {
                sb.append(words[i]);
            }
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        String newSentence = sb.toString();
        System.out.println(newSentence);
    }
}