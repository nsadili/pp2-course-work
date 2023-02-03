public class CoinTossing {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.exit(1);
        }

        var numberOfTrails = Integer.valueOf(args[0]);
        double res;

        for (int i = 0; i <= numberOfTrails; i++) {
            res = Math.random();

            if (res < 0)
                System.out.println("Head");
            else
                System.out.println("Tail");
        }
    }
}
