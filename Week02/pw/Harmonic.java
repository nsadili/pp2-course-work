import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {

        // Scanner sc=new Scanner(System.in);

        if (args.length < 1) {
            System.out.println("enter the number");
            System.exit(1);
        }

        int a = Integer.parseInt(args[0]);

        var i = 1;
        var sum = 0.0;

        for (; i <= a; i++) {
            sum += 1.0 / i;

        }
        System.out.printf("%.3f\n", sum);

    }
}
