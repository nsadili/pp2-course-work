import java.util.Scanner;       
public class TaylorSin    
{
    public static int factorial(int n)
    {
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact = fact*i;      
        }
        return fact;      
    }
   public static void main(String[] args)      
   {

       Scanner sc = new Scanner(System.in);    
       double x = sc.nextDouble();   int n =sc.nextInt();                
       double Sum = 0;        
       for(int i=0;i<n;i++)    
       {
           Sum += (Math.pow(-1,i)*Math.pow(x,2*i+1))/factorial(2*i+1); 
       }
       System.out.println("sin(x) = "+Sum); 
   }
}