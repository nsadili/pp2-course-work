import java.util.Scanner;

public class calc {
  public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println("Sum of your digits: "+ (a + b));
    System.out.println("Substraction of your digits: "+ (a - b));
    System.out.println("Multiplication of your digits: "+ (a * b));
    System.out.println("Division of your digits: "+ (a / b));
    System.out.println("Remainder of your digits after division: "+ (a % b));

    


      scanner.close();
      
  }
}
