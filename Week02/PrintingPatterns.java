
public class PrintingPatterns
{
    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.out.println("Please enter a  number");
            System.exit(1);
        }

        var size = Integer.parseInt(args[0]);

        for (int i = 0; i < size; i++)
     {
        for (int j = 0; j < size; j++)
         {
            if ((i + j) % 2 == 0) 
            {
                System.out.print("* ");
            } 
            else 
            {
                System.out.print("# ");
            }
        }
        System.out.println();
     }
    }
}    