import java.util.Scanner;

public class ArmstrongNumbers {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int number = 371;

        originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an ArmstrongNumbers number.");
        else
            System.out.println(number + " is not an ArmstrongNumbers number.");
    }
}
