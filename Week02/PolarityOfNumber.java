import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args){
 Scanner scanner= new Scanner(System.in);
 double n = scanner.nextDouble();

 if(n>0) 
 System.out.println("positive");
 else if (n<0)
 System.out.println("negative");
 else
 System.out.println("neutral");
    }
}
