public class Harmonic {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Enter a value");
            System.exit(1);
        }

        var n = Integer.parseInt(args[0]);

        var sum = 0.0;
        for (int cnt = 1; cnt <= n; cnt++) {
            sum += 1.0 / cnt;
        }

        System.out.printf("%f\n", sum);

    }
}
