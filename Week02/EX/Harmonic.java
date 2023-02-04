public class Harmonic {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Enter a value");
            System.exit(1);
        }
        var n = Integer.parseInt(args[0]);
        var sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.printf("%.3f", sum);
    }

}
