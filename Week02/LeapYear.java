import java.util.Scanner;
public class LeapYear {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int year = scan.nextInt();
     
    boolean isLeapYear = false;

    if(year % 4 == 0){
        if(year % 100 == 0){
            if(year % 400 == 0){
                isLeapYear = true;
            }else{
                isLeapYear = false;
            }
        }else{
            isLeapYear = true;
        }
    }else{
        isLeapYear = false;
    }
    if(isLeapYear) {
      System.out.println(year + " is Leap Year");
    } else {
      System.out.println(year + " is not Leap Year.");
    }
  }
}
