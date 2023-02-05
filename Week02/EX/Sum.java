import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("n:");
        int n = scan.nextInt();
        System.out.print("n1:");
        var n1 = scan.nextInt();

        var sum = n + n1;

        System.out.printf("%d + %d = %d", n, n1, sum);

    }
}