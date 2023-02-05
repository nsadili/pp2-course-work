import java.util.Scanner;
import java.util.Random;

public class CoinTossing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int value;
        float heads, tails;
        heads = tails = 0;
        input.close();
        Random rand = new Random();
        for(int i = 0; i < n; i++){
            // Get a random value, 0 or 1.
            value = rand.nextInt(2);
            if(value == 1) heads++;
            else tails++;
        }   
        System.out.printf("the probability of heads: %.0f percent\nthe probability of tails: %.0f percent\n", heads / n * 100, tails / n * 100);
    }
    
}
