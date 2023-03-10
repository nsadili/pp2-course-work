import java.util.*;
public class MixedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
         sc.close();
         System.out.println(mix(sentence));

}

static String mix(String sentence){
    String space=" ";
String[] words = sentence.split(" ");
    StringBuilder result = new StringBuilder();
    for (String word : words){
        if (word.length() == 1)
            result.append(word);
        else {
            result.append(word.charAt(word.length() - 1));
            result.append(word.substring(1, word.length() - 1));
            result.append(word.charAt(0));
            result.append(space);
        }
    }

    return result.toString();
}
}
