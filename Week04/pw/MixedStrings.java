import java.util.Scanner;

public class MixedStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String ns = swapFirstAndLast(sentence);

        System.out.println(ns);
    }


    public static String swapFirstAndLast(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder ns = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 1) {
                ns.append(word);
            } 
            
            else {

                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);

                String rs = last + word.substring(1, word.length() - 1) + first;
                ns.append(rs);
                ns.append(" ");
            }
        
        }


        return ns.toString().trim();
    }

}