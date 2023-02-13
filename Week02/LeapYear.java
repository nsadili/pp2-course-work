import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double number =scn.nextDouble();
        if(number % 4 == 0){
            System.out.println("Leap Year");
        }
        else if(number % 4 != 0){
            System.out.println("Ordinary Year");
        }
       
    }
}