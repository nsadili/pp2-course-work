import java.util.Scanner;

public class PolarityOfNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextInt();

        if(a<0) System.out.print("negative");
        else if(a>0) System.out.print("positive");
        else System.out.print("neutral");
    }
    
}