import java.util.Scanner;
import java.util.Random;
public class RandomPointsInCircle {
   
    public static void main(String[] args ){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number!");
        int n = sc.nextInt();
        for(int i=1; i<+n; i++)
        {
        double a = Math.random();  
        double b = Math.random();
        if (((a*a)+(b*b))<=1)
        {
            a= Math.round(a*1000.0)/1000.0;
            b= Math.round(b*1000.0)/1000.0;
            System.out.println(a+" and "+b+ " --> "+ "InCircle");
        }
        else continue;
    }
        

     


    }
    
}