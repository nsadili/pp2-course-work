import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
String input1= scan.next();
String input2= scan.next();
System.out.println(Anagrams(input1, input2));

    }
    private static boolean Anagrams(String a1, String a2) {
        if(a1.length()!=a2.length())
        return false;
        else{
            char[] a1c = a1.toLowerCase().toCharArray();
            var a2c = a2.toLowerCase().toCharArray();
           Arrays.sort(a1c);
           Arrays.sort(a2c);
           int k=0;
           for(int i=0;i<a1c.length;i++){
           if(a1c[i]==a2c[i]) 
           k++;
           }
if (k==a1c.length) 
return true; 
else return false;
           

        }
    }
}

