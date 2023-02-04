public class CoinToss {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.exit(1);
        }
        var tosses = Integer.valueOf(args[0]);
        double res;
        for (int i = 1; i <= tosses; i++) {
            res = Math.random();
            if (res < 0.5)
                System.out.println("Heads");
            else
                System.out.println("Tails");
        }
    }
}
