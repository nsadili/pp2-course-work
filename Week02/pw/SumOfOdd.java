import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int m = input.nextInt();

        int sum = 0;
        int i = 0;

        for (i = n; i <= m; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }

        }

        System.out.println(sum);

    }

}
