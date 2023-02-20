import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println("Enter two strings: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(anagrams(str1, str2));
    }
    private static String anagrams(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        if(s1.length()!=s2.length()) {
            
            return "Not Anagrams";
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean res = Arrays.equals(ch1,ch2);
        if(res==true) {
            return "Anagrams!";
        }
        else {
            return "Not Anagrams";
        }
    }
}
