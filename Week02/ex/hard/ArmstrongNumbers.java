import java.util.Scanner;

public class ArmstrongNumbers {
    public static boolean isArmstrongNumber(long n) {
        long pow = (long)(Math.log10(n) + 1);
        double sum = 0;
        for (long i = n; i > 0; i /= 10) {
            sum += Math.pow(i % 10, pow);
        }
        return (long)sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        if (sc.hasNextLong()) {
            long y = sc.nextLong();
            for (long i = x; i < y; i++) {
                if (isArmstrongNumber(i)) System.out.println(i);
            }
        } else System.out.println(x + " is " + (isArmstrongNumber(x) ? "" : "not ") + "an Armstrong number.");
    }
}
