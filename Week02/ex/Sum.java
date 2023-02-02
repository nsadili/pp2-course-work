import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("num1 > ");
        int n1 = scan.nextInt();
        System.out.print("num2 > ");
        var n2 = scan.nextInt();

        var sum = n1 + n2;

        System.out.printf("%d + %d = %d\n", n1, n2, sum);
    }
}