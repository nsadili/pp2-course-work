package Week02;

import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add the number: ");
        double num = sc.nextDouble();
        if (num == 0)
            System.out.println("The number is neutral.");
        else if (num > 0)
            System.out.println("The number is positive.");
        else
            System.out.println("The number is negative.");

    }


}
