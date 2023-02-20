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
    private static String reverse2(String str){
        char [] chars = str.toCharArray();
        var len= chars.length;
        for(int i=0; i<chars.length/2;i++){
            char temp= chars[i];
            chars[i]= chars[len-1-i];
            chars[len-1-i]= temp;
        }
        return new String(chars);

    }
    private  static String reverse3(String str){
        StringBuilder sb= new StringBuilder();
        for(int i= str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));


        }
        return sb.toString();
    }
    private static String reverse4(String str){
        return new StringBuilder(str).reverse().toString();
    }

}
