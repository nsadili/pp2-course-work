import java.util.Scanner;
public class SortingString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        System.out.println(sort(input));
    }
    
    static String sort(String str) {
        char[] chars = str.toCharArray();
        int k = chars.length;
        for (int i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                if (chars[i] > chars[j]) {
                    char tmp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = tmp;
                }
            }
        }
        return new String(chars);
    }
}
