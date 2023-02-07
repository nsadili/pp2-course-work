import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);

        int a=scan.nextInt();

if(a%400==0)
System.out.println("leapyear");
else
System.out.println("not");

    }
}
