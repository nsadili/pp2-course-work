import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the 1st string!");
        String std1 = sc.next();
        System.out.println("Please enter the 2nd string!");
        String std2 = sc.next();

        System.out.printf("Is being these strings anagram false or true? --> %b", checkingAnagram(std1, std2));



    }

    private static boolean checkingAnagram(String str01,String str02){
        str01 = str01.toLowerCase();
        str02 = str02.toLowerCase();

        if (str01.length() != str02.length()) return false;

        char[] str01A = str01.toCharArray();
        char[] str02A = str02.toCharArray();

        Arrays.sort(str01A);
        Arrays.sort(str02A);

        return Arrays.equals(str01A,str02A);
    }
}
