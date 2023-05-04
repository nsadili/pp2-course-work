public class Fact {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one integer argument.");
            return;
        }
        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            System.out.println("Error: the input number cannot be negative.");
            return;
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }
}
