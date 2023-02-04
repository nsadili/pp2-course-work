public class CoinTossing
{
    public static void main(String[] args)
    {
        if(args.length < 1)
        {
            System.out.println("Enter a number");
            System.exit(1);
        }

        var numberOfTrials = Integer.parseInt(args[0]);
        double res;

        for (int i=1; i< numberOfTrials; i++)
        {
             res = Math.random();

        if(res < 0.5)
          System.out.printf("%d: Head\n", i);
        else
          System.out.printf("%d: Fail\n", i);

        }



        
    }
}