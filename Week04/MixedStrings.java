package week04;

import java.util.Scanner;

public class MixedStrings {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      String sentence = sc.nextLine();
        String newSentence = swap(sentence);
        System.out.println(newSentence);
    }
    
    public static String swap(String sentence) {
        StringBuilder res = new StringBuilder();
        String[] words = sentence.split(" ");
        
        for (String word : words) {
            if (word.length() == 1) {
                res.append(word);
            } else {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);
                res.append(lastChar).append(middle).append(firstChar);
            }
            res.append(" ");
        }
       
        res.deleteCharAt(res.length() - 1);
        
        return res.toString();
    }
}

