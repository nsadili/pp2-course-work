import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        var min = Float.MAX_VALUE;
        var max = Float.MIN_VALUE;

        Scanner scan = new Scanner(System.in);

        while (scan.hasNextFloat()) {

            var num = scan.nextFloat();
            if (num >= max)
                max = num;
            if (num <= min)
                min = num;
        }
        System.out.printf("Minimum number: %f, Maximum number: %f", min, max);

    }
}
