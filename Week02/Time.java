public class Time
{
    public static void main(String[] args)
    {
        if(args.length < 1)
        {
            System.out.println("Please, enter number that represents seconds");
            System.exit(1);
        }

        var seconds = Integer.parseInt(args[0]);

        if(seconds < 0)
        {
            System.out.println("Please, enter a non-negative number");
            System.exit(1);
        }

        // 1 minute - 60 seconds / 1 hour - 3600 seconds

        var hours = seconds / 3600;
        var minutes = (seconds % 3600) / 60;
        var seconds2 = (seconds % 3600) % 60;

        System.out.printf
        (
            "Given Seconds = %d, Hours = %d, Minutes = %d, Seconds = %d\n",
            seconds, hours, minutes, seconds2
        );    

    }
}