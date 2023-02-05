import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double min = 2147483647;
        double max = -2147483647;

        while (sc.hasNextDouble()) {
            double input = sc.nextDouble();
            if (input < min)
                min = input;
            if (input > max)
                max = input;
        }

        System.out.println("Minimum" + min);
        System.out.println("Maximum" + max);
        sc.close();
    }
}