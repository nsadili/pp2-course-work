package Week04.pw12;
import java.util.Scanner;

public class Substring {
    static int subString(String str1, String str2){
        return str1.indexOf(str2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter the substring: ");
        String str2 = scan.nextLine();
        scan.close();
        System.out.printf("%d\n", subString(str1, str2));
    }
}
