import java.util.Scanner;
public class Task7Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        System.out.println(reversed(a));
        scan.close();
    }

    public static String reversed(String a) {
        StringBuilder res = new StringBuilder("");
        // Read the String characters from right to left and assign them into StringBuilder
        for(int i = a.length() - 1; i >= 0; i--) {
            res.append(a.charAt(i));
        }
        return res.toString();
    }
}
