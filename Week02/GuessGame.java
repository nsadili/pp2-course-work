import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the upper bound number: ");
        int a = scan.nextInt(); 
        int int_random = rand.nextInt(a);
        int cnt=0;
        while(true) {
            System.out.println("Guess the number!");
            cnt++;
            int temp=scan.nextInt();
            if(temp==int_random) {
                System.out.println("You guessed!");
                break;
            }
            if(temp!=int_random) {
                if(temp>int_random) System.out.println("Entered number is greater than guessed number!");
                if(temp<int_random) System.out.println("Entered number is less than guessed number!");
            }
        }
        System.out.println("Your score is: " +cnt);
        if(cnt<=3) System.out.println("Well done!");
        if(cnt>=4 && cnt<=6) System.out.println("Not bad!");
        if(cnt>=7) System.out.println("Try harder!");
    }
}
