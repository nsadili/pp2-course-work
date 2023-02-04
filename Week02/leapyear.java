import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) throws Exception {
     
      Scanner scanner = new Scanner(System.in);
      int year = scanner.nextInt();
      if(year % 4 == 0 && year % 400 != 0)
      {
        System.out.println("It is a leap year");
      }
      else 
      {
        System.out.println("It is not a leap year");
      }

     
  }
}
