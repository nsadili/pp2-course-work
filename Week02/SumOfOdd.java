import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indicate the first number: ");
        int x = sc.nextInt();
        System.out.println("Indicate the second number: ");
        int y = sc.nextInt();
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        int result = 0;
        for (int i = x; i <= y;i++) {
            if (i % 2 != 0) result += i;
        }
        System.out.println("The sum of odd numbers between the given numbers is: " + result);
        sc.close();
    }
}