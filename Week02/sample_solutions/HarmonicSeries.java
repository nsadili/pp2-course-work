/**
 * To compile: javac -d ./classes .\HarmonicSeries.java <br />
 * To execute: java -cp .\classes\ HarmonicSeries {value} <br />
 * 
 * @author Nuraddin Sh. Sadili
 */

public class HarmonicSeries {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("n is not entered.");
            System.exit(0);
        }

        int n = Integer.parseInt(args[0]);
        // int n = Integer.valueOf(args[0]);

        System.out.println("Entered integer value: " + n);

        if (n < 1) {
            System.out.println("Provided integer value for n must be greater than ZERO.");
            System.exit(0);
        }

        float sum = 0.0f;

        for (int i = 1; i <= n; i++) {
            sum += 1.0f / i;
        }

        System.out.printf("%.3f\n", sum);
    }
}