import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        int input2 = scn.nextInt();
        int sum = 0;
        for (int i = input; i <= input2; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
