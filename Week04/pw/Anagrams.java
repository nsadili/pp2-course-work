import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the first input: ");
        String str1 = sc.nextLine();

        System.out.println("Please, enter the second input: ");
        String str2 = sc.nextLine();

        boolean areAnagrams = ifAnagrams(str1, str2);
        if (areAnagrams) { 
            System.out.println("The two strings are anagrams");
        } else { 
            System.out.println("The two strings are not anagrams");
        }
        sc.close();
    }
    public static boolean ifAnagrams(String str1, String str2) {
       
        str1 = str1.replaceAll(" ", "");
        str2 = str2.replaceAll(" ", "");
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            return Arrays.equals(charArray1, charArray2);
        }else {
            return false;
        }
    }
    }

