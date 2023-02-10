import java.util.Scanner;

public class MinMax
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);

        double max = Double.NEGATIVE_INFINITY; // as far as we dont have exact range, double max and min can be initialized with infinity
        double min = Double.POSITIVE_INFINITY;

        while (n.hasNextDouble()) //checks if there is a double input
        {
          double number = n.nextDouble(); // this is being used for making sure that if there is a more values to read or not for program to work

          max = Math.max(max,number); // these max and min methods checks and returns max and min numbers from the list of inputs
          min = Math.min(min,number);
        }   

        System.out.println("Maximum is " +max);
        System.out.println("Minimum is " +min);

        //It did not give output with printf
        //Do not forget to use ^Z EOF
        

    }
}