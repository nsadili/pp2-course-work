import java.util.Arrays;
import java.util.Scanner;

public class PW12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string, sub;
        System.out.print("Enter string: ");
        string = scanner.nextLine();
        System.out.print("Enter sub: ");
        sub = scanner.nextLine();
        scanner.close();
        System.out.println(substring(string, sub));        
    }

    static int substring(String string, String sub) {
        int result = 0;
        char[] array1 = string.toCharArray();
        char[] array2 = sub.toCharArray();
        for (int i = 0; i < array2.length; i++) {
            if (array1[i] == array2[i]) result = i;
            else {
                result = -1;
                break;
            }
        }
        return result;
    }
}
