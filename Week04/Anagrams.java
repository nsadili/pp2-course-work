import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        if(str1.length()==str2.length()) System.out.println("False");
        else{
            System.out.println(sortString(str1,str2));
        }
    }
    public static String sortString(String str1, String str2) {
        boolean flag=true;
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int length=str1.length();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        for(int i=0; i<length; i++){
            if(charArray1[i]!=charArray2[i]) flag=false;
            break;
        }
        System.out.println(charArray1);
        System.out.println(charArray2);
        if(flag) return "True";
        else return "False";
    }
}