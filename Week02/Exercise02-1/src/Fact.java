import java.util.Scanner;

public class Fact {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        long n = 1;
        for (int i = 1; i <=a ; i++) {
            n *= i;
            if (a == 1) break;
            System.out.print(i);
            if (i != a) System.out.print(" * ");
        }
        if (n > 1) System.out.print(" = " + n);
        else System.out.print(n);
    }
}
