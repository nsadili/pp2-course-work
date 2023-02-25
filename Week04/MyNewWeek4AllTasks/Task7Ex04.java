import java.util.Scanner;

public class Task7Ex04 {
    public static String reversed(String a) {
        StringBuilder res = new StringBuilder("");
        int n = a.length();
        // Read the String characters from right to left and assign them into StringBuilder
        for(int i=n-1;i>=0;i--) {
            res.append(a.charAt(i));
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        String a = con.next();
        System.out.println(reversed(a));
        con.close();
    }
}
