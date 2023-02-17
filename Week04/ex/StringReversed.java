import java.util.Scanner;
public class StringReversed {
   public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);

    String input = scan.next();

    System.out.println(reverseV1(input));



   } 
   static String reverseV1(String str) {
      String res = "" ; 

      for (int i = str.length() - 1; i>=0; i--) {
        res += str.charAt(i);  
      }
       return res;
   }

}
