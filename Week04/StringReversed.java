import java.util.Scanner;

public class StringReversed {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            String word= scan.nextLine() ;
System.out.println(reverse(word));
        }
        }
    public static String reverse(String str){
        String res = "";
        for(int i= str.length()-1 ;i >=0 ;i--) {
res += str.charAt(i);
        }
        return res;
    }
}