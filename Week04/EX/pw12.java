package EX;
import java.util.Scanner;

public class pw12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Print a statement: ");
        String str = scan.nextLine();
        System.out.print("Print another statement: ");
        String sub = scan.nextLine();
        System.out.printf("Index: %d\n",
        checkSub(str, sub));
        scan.close();
    }

    public static int checkSub(String str, String sub){
        if(str.indexOf(sub) != -1) {
            return str.indexOf(sub);
        } else {
            return -1;
        }
    }
}
