import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter the year: ");
        long a = scan.nextLong();
        if ((a%100==0 && a%400==0) || (a%4==0 && a%100!=0)) System.out.printf("%d is Leap year!",a);
        else System.out.printf("%d is not Leap year!",a);
        


    }
    
}
