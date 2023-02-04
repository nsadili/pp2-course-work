import java.util.Scanner;

public class PolarityOfNUmber {
  public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();

    if(a < 0)
    {
      System.out.println("Your integer is negative");
    }
    if(a > 0)
    {
      System.out.println("Your integer positive");
    }
    if(a == 0)
    {
      System.out.println("Your integer is zero");
    }
    


      scanner.close();
      
  }
}
