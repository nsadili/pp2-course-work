package Week04.Strings;
import java.util.Scanner;

public class Stringreverse {
    public static void main(String[] args) {
        System.out.println("Enter the String:");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(reverse(str));
    }
    private static String reverse( String str){
        String reversedString="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedString+=str.charAt(i);
        }
        return reversedString;
    }
}
