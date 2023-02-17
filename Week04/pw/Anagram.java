import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();


        sc.close(); 

        System.out.println(anagram(str1, str2));

    }
    
    public static boolean anagram(String str1, String str2){
        
        char[] str11= str1.toLowerCase().toCharArray();
        char[] str22= str2.toLowerCase().toCharArray();

        Arrays.sort(str11);
        Arrays.sort(str22);

        return Arrays.equals(str11, str22);
    }

}
