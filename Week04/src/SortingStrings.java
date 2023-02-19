import java.util.*;

public class SortingStrings {
    public static void sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sortString(str);
    }
}
