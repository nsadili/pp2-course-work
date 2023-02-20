package Week04.PW;
import java.util.Scanner;
import java.util.Arrays;

    public class Anagrams {
      
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                String x =sc.nextLine();
                String y =sc.nextLine();

                System.out.println("Please, enter first string: ");
                System.out.println("Please, enter second string: ");

                System.out.println(checkAnagram(x, y));
            }
    
        }

    

 
    private static boolean checkAnagram(String x, String y) {
        if (x.length() != y.length()) {
            return false;
        }
        char[] charArray1 = x.toCharArray();
        Arrays.sort(charArray1);

        char[] charArray2 = y.toCharArray();
        Arrays.sort(charArray2);
    
        return Arrays.equals(charArray1, charArray2);

    }
}