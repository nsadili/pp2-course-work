import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int sum = 0;
        if (n1 % 2 != 1)
            n1 = n1 + 1;
        if (n2 % 2 != 1)
            n2 = n2 - 1;
        while (n1 <= n2) {
            sum = sum + n1;
            n1 += 2;
        }
        System.out.println(sum);
    }

}
