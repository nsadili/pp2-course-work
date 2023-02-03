import java.util.Scanner;
public class Polarity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        var num = sc.nextDouble();
        if (num > 0) {
          System.out.println("Positive");
        } else if (num < 0) {
          System.out.println("Negative");
        } else {
          System.out.println("Neutral (0)");
        }
      }
    }

