import java.util.Scanner;

public class PolarityOfNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please add the number: ");
        double x = scn.nextDouble();
        if (x == 0)
            System.out.println("The number is neutral");
        else if (x > 0)
            System.out.println("The number is positive");
        else
            System.out.println("The number is negative");
            scn.close();
    }
}