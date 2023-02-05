public class CoinTossing {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.exit(1);
        }

        int head = 0, tail = 0;
        var num = Integer.valueOf(args[0]);
        double res;

        for (int i = 1; i <= num; i++) {
            res = Math.random();

            if (res < 0.5) {
                System.out.println("Head");
                head++;
            } else {
                System.out.println("Tail");
                tail++;
            }
        }

        System.out.printf("Heads: %d, tails: %d \n", head, tail);
        System.out.printf("probability of showing heads: %.3f and tails: %.3f\n", (double) head / num, (double) tail / num);
    }
}
