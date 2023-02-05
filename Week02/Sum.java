package Week02;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add First number");
        int number1 = sc.nextInt();
        System.out.println("Please add Second number");
        int number2 = sc.nextInt();
        System.out.println("The result is: " + (number1 + number2));
    }
}
