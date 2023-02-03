public class Harmonic {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Enter a value");
            System.exit(1);
        }

        var n = Integer.parseInt(args[0]);

        var sum = 0.0;
        for (int count = 1; count <= n; count++) {
            sum += 1.0 / (count + 1);
        }
        System.out.printf(".3%f\n", sum);
    }
}
