import java.util.Scanner;
import java.util.Random;

public class DiceMan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        while(true) {
        System.out.println("Enter the number!");
        int a = scan.nextInt();
        int int_random = rand.nextInt(12);
            if(a>12) {
                System.out.println("Please enter number from 2 to 12");
                System.exit(1);
            }
            if(a==0) System.exit(1);
        System.out.println("Your number is: " +a);
        System.out.println("The computer's number is: " +int_random);
        if(a==int_random) System.out.println("You guessed!");
        if(a!=int_random) System.out.println("You did not guess:(");
    }
}
}
