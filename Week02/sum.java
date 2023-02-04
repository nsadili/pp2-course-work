import java.util.Scanner;

public class sum {
  public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println("Sum of your digits: "+ (a + b));

    


      scanner.close();
      
  }
}
