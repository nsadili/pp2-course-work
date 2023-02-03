import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number: ");
        var a=input.nextFloat();
        System.out.println("It is " + a/3600 + " hours");
        System.out.println("It is " + a/60 + " minutes");
        System.out.println("It is " + a + " seconds");

    }
}
