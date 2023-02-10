import java.util.Scanner;
import java.util.Random;


public class GuessGame {
    public static void main(String[] args){

        System.out.print("Enter the upper bound: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        Random rand = new Random();
        int number = rand.nextInt(a) + 1;

        int c = 1;
        System.out.print("Guess the number: ");
        while(input.hasNextInt()){
            int guess = input.nextInt();
            if(guess == number){
                System.out.println("You win!\nNumber of attempts: " + c);
                break;
            }
            else if(guess > number) System.out.println("LOWER");
            else if(guess < number) System.out.println("HIGHER");
            System.out.print("Guess the number: ");
            c++;
        }
        
        input.close();      
    }
}
