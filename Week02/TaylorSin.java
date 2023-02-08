public class TaylorSin {
  public static void main(String[] args) {

    if (args.length < 2) {
      System.out.println("two values must be entered.");
      System.exit(0);
    }

    double x = Double.valueOf(args[0]);
    int n = Integer.valueOf(args[1]);

    if (n <= 0) {
      System.out.println("n must be positive!");
      System.exit(0);
    }

    double sin = 0.0;
    double pow = x, fact = 1;
    for (int i = 0; i < n;) {
      sin += Math.pow(-1, i) * pow / fact;
      i++;
      pow *= x * x;
      fact *= 2 * i * (2 * i + 1);
    }

    System.out.printf("sin(%.3f) with %d precision is: %.3e\n", x, n, sin);

  }
}