package week4;
import java.util.Scanner;
public class Stringreversed {
    public static void main(String[] args){
        
        Scanner sc  = new Scanner(System.in);
        String sb = sc.nextLine();
        char[] sb2 = sb.toCharArray();
        for (int i = 0; i<= (sb2.length/2); i++){
            char temp = sb2[i];
            sb2[i] = sb2[sb2.length-1-i];
            sb2[sb2.length-1-i] = temp;
        }
        /*String reversed = new String(sb2)
         *System.out.println(reversedString);
         */
         // not System.out.println(sb2.toString()); 
        System.out.println(new String(sb2));
    }
    
}
/* String str = "Hello, world!";
StringBuilder sb = new StringBuilder(str);
String reversed = sb.reverse().toString();
System.out.println(reversed);
*/

