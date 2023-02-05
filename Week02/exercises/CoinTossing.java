public class CoinTossing {
    public static void main(String[] args) {
        if (args.length < 1)
        {
            System.out.println("Please, provide a valid number!");
            System.exit(1);
        }

        var n=Integer.valueOf(args[0]);
        double res;

        for(int i=0; i<n; i++)
        {
            res= Math.random();
            if(res<0.5) System.out.println("Head"); else System.out.println("Tail");
        }
        
    }
}
