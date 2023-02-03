public class CoinTossing {
    public static void main(String[] args) {

        if(args.length < 1){
            System.exit(1);
        }

        var nboTrails = Integer.valueOf(args[0]);
        double res;

        for(int i = 1; i <= nboTrails; i++){
             res = Math.random();
        }
        if(res < 0.5)
            System.out.println("Head");
        else
        System.out.println("Tail");
    }
}
