package week2_assignments;
import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double n = input.nextInt();
        input.close();
        if(n < 0) System.out.print("negative");
        else if(n > 0) System. out.print("postive");
        else System.out.print("neutral");
    }
}
