package Week04;

import java.util.Scanner;

public class Mixed {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence = "This is PP2 Fall 2021";
        String newSentence = swapFirstAndLast(sentence);
        System.out.println(newSentence); 
        String s1=sc.nextLine();


    }

    public static String swapFirstAndLast(String sentence) {
        
        String[] words = sentence.split(" ");
    
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 1) {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                String newWord = lastChar + word.substring(1, word.length() - 1) + firstChar;
                words[i] = newWord;
            }
        }
    
        
        String newSentence = String.join(" ", words);
        return newSentence;
    }
        
}
