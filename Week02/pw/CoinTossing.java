public class CoinTossing {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.exit(1);
        }
        var num = Integer.valueOf(args[0]);
        double res;
        for (int i = 1; i <= num; i++) {
            var res = Math.random();
            if (res < 0.5)
                System.out.println("Head");
            else
                System.out.println("Tail");
        }
    }
}
