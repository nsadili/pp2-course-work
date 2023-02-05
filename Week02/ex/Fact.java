public class Fact {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("one integer: ");
        }

        int n = Integer.parseInt(args[0]);

        if (n < 0) {
            System.out.println("Error");
        }

        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }

        System.out.println(f);
    }
}