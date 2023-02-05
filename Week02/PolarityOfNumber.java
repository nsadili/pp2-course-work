public class PolarityOfNumber
{
    public static void main(String[] args)
    {
         if (args.length < 1)
        {
            System.out.println("Please enter a  number");
            System.exit(1);
        }

        var n = Float.parseFloat(args[0]);

        if (n > 0)
        System.out.println("Positive");

        else if (n < 0)
        System.out.println("Negative");

        else if (n == 0)
        System.out.println("Neutral");

    }
}