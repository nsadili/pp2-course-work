
import java.util.Scanner;
import java.util.Random;

public class DiceMan
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random(); // "Random" is an object that generates random numbers

        int input = -1; //the input should be initialized to -1 or the program without it will consider it as 0. so program will never be run.
       
        
        while(input != 0)
        {
            System.out.println("Enter a number between [2-12] : "); // minimum sum of 2dices is 2 so range is [2-12]
            input = scan.nextInt(); //to read an integer input from the user

             if(input == 0)
            {
                break;   // this part is "program is terminated if user enters 0" of task
            }

            if(input < 2 || input > 12)
            {
                System.out.println("Invalid input, please enter a number between [2-12]"); 
                continue; // if user prints invalid input the program will skip the current iteration, then print an error message, then move to next iteration 
            }            
        }

        int randomDices = rand.nextInt(11) + 2; // if we would write it as "rand.nextInt(11)" it will generate numbers from [0,11] so by adding 2 the range will turn to [2,13] which we need. as 13 is not the result of 2dices it is not necessary

        if(input == randomDices)
        {
            System.out.println("User wins!");
        }
        else
        {
            System.out.println("Computer wins!");
        }


    }
}