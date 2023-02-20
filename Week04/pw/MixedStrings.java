import java.util.Scanner;

public class MixedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        
        String newSentence = swapFirstAndLast(sentence);
        System.out.println(newSentence);   
         }

    public static String swapFirstAndLast(String sentence) {

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 1) 
            { 
                char firstChar = words[i].charAt(0);
                char lastChar = words[i].charAt(words[i].length() - 1);
                words[i] = lastChar + words[i].substring(1, words[i].length() - 1) + firstChar;
            }
        }

        
        String newSentence = String.join(" ", words);

        return newSentence;
    }
}