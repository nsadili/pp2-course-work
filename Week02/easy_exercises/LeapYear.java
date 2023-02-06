import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {

    Scanner year = new Scanner(System.in);

    int leapyear = year.nextInt();

    if (leapyear % 4 == 0){
        System.out.println("This is a leap year.");
    }
    else {
        System.out.println("This is not a leap year.");
    }

  }
}