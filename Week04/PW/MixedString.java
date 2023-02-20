import java.util.Scanner;
public class MixedString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String sentence = input.nextLine();
        
        String newSentence = swapFirstLastChars(sentence);
        
        System.out.println(newSentence);
    }
    
    public static String swapFirstLastChars(String sentence) {
        String[] words = sentence.split(" ");
        
        String newSentence = "";
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);
            String middleChars = word.substring(1, word.length() - 1);
            
            String newWord = lastChar + middleChars + firstChar;
            newSentence += newWord + " ";
        }
        
        return newSentence.trim();
    }
}


