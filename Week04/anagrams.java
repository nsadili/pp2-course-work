import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine();

        String a2 = sc.nextLine();
        System.out.println(checkAnagram(a1, a2));

    }

    private static boolean checkAnagram(String a1, String a2) {

        if (a1.length() != a2.length()) {
            return false;
        }

        char[] arr1 = a1.toLowerCase().toCharArray();
        var arr2 = a2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (var i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}
