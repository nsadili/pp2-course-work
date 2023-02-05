import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int smallerN = Math.min(n1, n2);
        int largerN = Math.max(n1, n2);

        int sum = 0;

        for (int i = smallerN; i <= largerN; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
