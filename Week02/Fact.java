public class Fact {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("please provide some input:");
            System.exit(1);
        }

        var n = Integer.parseInt(args[0]);
        var f = 1L;
        for (int c = 1; c <= n; c++) {
            f *= c;
        }
        System.out.printf("%d! = %d", n, f);
    }

}
