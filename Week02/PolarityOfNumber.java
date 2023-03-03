import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            double number =scn.nextDouble();
            if(number>0){
                System.out.println("Positive");
            }
            else if(number<0){
                System.out.println("negative");
            }
            else if( number==0){
                System.out.println("Neutral");
            }
        }
    }
}