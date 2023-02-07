public class Fact {
    public static long fact(long n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        if (n < 0) System.out.println("Error: " + n + " is negative.");
        else System.out.println(fact(n));
    }
}
