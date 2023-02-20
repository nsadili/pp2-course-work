import java.util.Scanner;

public class MixedStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Print a statement: ");
        String str = scan.nextLine();
        System.out.println("Changed statement: " + changedString(str) + '\n');
        scan.close();
    }
    public static String changedString(String str){
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++){
            char[] charArray = words[i].toCharArray();
            int len = charArray.length - 1;
            char temp = charArray[0];
            charArray[0] = charArray[len];
            charArray[len] = temp;
            String changedString = new String (charArray);
            words[i] = changedString;
        }
        return String.join(" ", words);
    }
}
