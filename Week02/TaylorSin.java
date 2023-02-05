import java.util.Scanner;
import java.lang.Math;


public class TaylorSin {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double x = input.nextDouble();
        input.close();
        System.out.println("calculated using Math.sin(x)" + Math.sin(x));
        //not solved
    }
}
