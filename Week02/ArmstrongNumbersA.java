public class ArmstrongNumbersA
{
    public static void main(String[] args)
    {
        if(args.length < 1)
        {
            System.out.println("Enter a number");
            System.exit(1);
        }

        var n = Integer.parseInt(args[0]);

        int original = n;
        int sum = 0;

        while(n != 0)
        {
            int digit = n % 10;
            sum = sum + digit*digit*digit;
            n = n / 10;
        }

        if(sum == original) 
        {
            System.out.println(original + " is an Armstrong Number");
        }
        else
        {
            System.out.println(original + " is not an Armstrong Number");
        }

    }
}   
