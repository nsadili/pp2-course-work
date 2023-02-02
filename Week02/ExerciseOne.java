package Week02;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add First number");
        int numberone = sc.nextInt();
        System.out.println("Please add Second number");
        int numbertwo = sc.nextInt();
        System.out.println("The result is: " + (numberone + numbertwo));
    }
}
