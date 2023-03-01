import java.util.Scanner;

public class MinMax {
    
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         double a = sc.nextDouble(); double b = sc.nextDouble();
         if ( a > b) System.out.println("Max: "+ a +"and" + "Min: " + b);
         else   System.out.println("Max: "+ b +"and" + "Min: " + a);
    }
    
}