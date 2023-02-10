public class LeapYear
{
    public static void main(String[] args)
    {
         if (args.length < 1)
        {
            System.out.println("Please enter a year");
            System.exit(1);
        }

        var year = Integer.parseInt(args[0]);

        if(year < 0)
        year= -year;

        if(year % 4 ==0)
        System.out.printf("%d is a leap year!", year);

        else
        System.out.printf("%d is not a leap year!", year);

    
    }
}