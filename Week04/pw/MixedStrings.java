import java.util.Scanner;

public class MixedStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(sent(input));
    }
    static String sent(String str){
     String[] a = str.split(" ");
     String res = "";
    for (int i = 0; i < a.length; i++){
        String words = a[i];
        
        char char1 = words.charAt(0);
    char char2 = words.charAt(words.length() - 1);
    String char3 = words.substring(1, words.length() - 1);
    a[i] = char2 + char3 + char1;
    
    res += a[i];
    
}
    return res;


    }
}
