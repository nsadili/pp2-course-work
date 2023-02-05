import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        input.close();
        //year that is evenly divisible by 4 is a leap year
        if(year % 4 != 0) System.out.println("not a leap year");
        else System.out.println("leap year");
    }
}
