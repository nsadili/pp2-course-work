package EX;

public class Calc {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Enter 2 numbers: ");
            System.exit(1);
        }

        var n = Integer.parseInt(args[0]);
        var n1 = Integer.valueOf(args[1]);

        System.out.println(args[0]);
        System.out.println(args[1]);

        System.out.println(n + n1);
        System.out.println(n - n1);
        System.out.println(n * n1);
        System.out.println(n / n1);
        System.out.println(n % n1);

    }
}