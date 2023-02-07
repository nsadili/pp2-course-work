import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), sum = 0;
        int x = a < b ? a : b, y = a >= b ? a : b;
        if (x % 2 == 0) x++; else x += 2;
        for (; x < y; x += 2) sum += x;
        System.out.println(sum);
    }
}
