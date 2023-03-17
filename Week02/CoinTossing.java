public class CoinTossing {
    public static void main(String[] args){
        if(args.length < 1)
        {
            System.out.println("Enter a number.");
            System.exit(1);

        }
        var numberOfTrial = Integer.parseInt(args[0]);
        double res;
        for(int i = 1; i<=numberOfTrial; i++){
            res = Math.random();
            if (res<0.5)
            {
                System.out.printf("Head", i);

            }
            else {
                System.out.printf("Tail", i);
            }
        }
    }
}
    

