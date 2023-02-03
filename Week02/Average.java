import java.util.Scanner;

public class Average 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        var sum = 0; // cannot be remain without initializing --> "var"
        var count = 0;
         
        while (scan.hasNextInt()) //checks if there is an integer input
        {
          sum += scan.nextInt();
          count++;
        }   

        //var avg = (double) sum / count; // first sum will be turned to double then division happens / typecasting

        System.out.println(
            (count ==0)? "Please, enter at least a number" :(double) sum / count
        );

    }
}    