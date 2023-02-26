import java.util.Scanner;
/*
    swapChars(a) does the instruction for 1 word
    solve(a) modifies the whole string
 */
public class Task11Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        System.out.println(solve(a));
        scan.close();
    }

    public static String swapChars(String a) {
        StringBuilder res = new StringBuilder("");
        res.append(a.charAt(a.length() - 1));
        res.append(a.substring(1, a.length()-1));
        res.append(a.charAt(0));
        a = res.toString();
        return a;
    }
    public static String solve(String a) {
        StringBuilder result = new StringBuilder("");
        StringBuilder builder = new StringBuilder("");
        int i = 0;
        while(i < a.length()) {
            if(! Character.isWhitespace(a.charAt(i))) {
                builder.append(a.charAt(i));
            }
            else {
                result.append(swapChars(builder.toString()) + " ");
                builder = new StringBuilder("");
            }
            i++;
        }
        if(!builder.toString().isEmpty()) {
            result.append(swapChars(builder.toString()) + " ");
        }
        return result.toString();
    }
}
