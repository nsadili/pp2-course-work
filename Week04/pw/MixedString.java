package Week04.pw;
import java.util.Scanner;
public class MixedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string:");
        String input = sc.nextLine(); 
        String output = swapFirstLast(input); 
        System.out.println(output); 
    }

    public static String swapFirstLast(String str) {
        String[] words = str.split(" "); 
        for (int i = 0; i < words.length; i++) { 
            char firstChar = words[i].charAt(0); 
            char lastChar = words[i].charAt(words[i].length() - 1); 
            String middleChars = words[i].substring(1, words[i].length() - 1); 
            words[i] = lastChar + middleChars + firstChar; 
        }
        return String.join(" ", words); // Join the array of words back into a single string, separated by spaces
    }
}


