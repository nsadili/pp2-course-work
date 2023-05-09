package Week02;



import java.util.Scanner;

public class Polarity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("add the number: ");
        double number = sc.nextDouble();
        if (number == 0)
            System.out.println("The number is neutral.");
        else if (number > 0)
            System.out.println("The number is positive.");
        else
            System.out.println("The number is negative.");

    }


}
