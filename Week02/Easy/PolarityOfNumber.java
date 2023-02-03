package Easy;
import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double number = scn.nextDouble();
        if (number > 0){
            System.out.println("positive");
        }
        else if (number == 0){
            System.out.println("neutral");
        }
        else {
            System.out.println("negative");
        }
        scn.close();
    }
   
}