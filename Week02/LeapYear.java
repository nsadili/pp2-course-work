import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the year"); 
        var a=input.nextInt();
        if(a%4==0) System.out.println("It is a leap year!");
        else System.out.println("It is not a leap year");
    }
}
