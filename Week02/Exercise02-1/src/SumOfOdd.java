import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int s = 0; int i;
        if (a > b) {
            for (i = b + 1; i < a; i++)
                if (i % 2 != 0) s += i;
            }
        else {
            for (i = a + 1; i < b; i++)
                if (i % 2 != 0) s += i;
            }
        System.out.print(s);
    }
}
