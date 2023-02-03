import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int tails = 0;
        int heads = 0;
        for(int i=0; i<n; i++) {
            double randomDouble = 1 + 2 * Math.random();
            int randomInt = (int) randomDouble;    
            if(randomInt == 1) {
                heads++;
                // System.out.println("Heads");
            } else {
                tails++;
                // System.out.println("Tails");
            }
        }
        float headsPercentage = (float) heads/n * 100;
        float tailsPercentage = (float) tails/n * 100;
        System.out.println("Heads: " + headsPercentage + "%");
        System.out.println("Tails: " + tailsPercentage + "%");
    }
}