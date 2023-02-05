import java.util.Scanner;

public class RandomPointsInCircle {
public static void main(String[] args) {
  
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n= scan.nextInt();
    double number  = Math.random();
    

   for(int i=0; i<n; i++) {

   System.out.printf("(%.1f, %.1f)%n", Math.random(), Math.random());

   }

}
}

