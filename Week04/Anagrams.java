import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static boolean areAnagrams(String m, String n) {
        char[] mArr = m.toCharArray();
        char[] nArr = n.toCharArray();

        Arrays.sort(mArr);
        Arrays.sort(nArr);

        return Arrays.equals(mArr, nArr);
    }

    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        String a = con.nextLine();
        String b = con.nextLine();

        if (areAnagrams(a, b))
            System.out.println("YES");
        else
            System.out.println("NO");

        con.close();
    }
}