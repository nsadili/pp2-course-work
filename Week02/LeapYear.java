import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        var year = sc.nextInt();
        sc.close();
        boolean isLeapYear = false;
        
        if (year % 400 == 0) {
            isLeapYear = true;
          } else if (year % 100 == 0) {
            isLeapYear = false;
          } else if (year % 4 == 0) {
            isLeapYear = true;
          }
          
          if (isLeapYear) {
            System.out.println(year + " is a leap year.");
          } else {
            System.out.println(year + " is not a leap year.");
          }
}
}