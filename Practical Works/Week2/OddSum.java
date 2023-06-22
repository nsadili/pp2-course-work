import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = obj.nextInt();

        System.out.print("Enter the second integer: ");
        int b = obj.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int sum = 0;
        for (int i = a + 1; i < b; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the odd numbers is " + sum + ".");
    }
}
