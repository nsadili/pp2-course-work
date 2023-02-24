import java.util.Scanner;
public class MathDemoTest {
    public static void main(String[] args) {
        System.out.println("Minimum value is: "+MathOper.min(5, 11));
        System.out.println("Minimum value is: "+ MathOper.max(5, 11));
        int arr[];
        Scanner scn= new Scanner(System.in);
        int m= scn.nextInt();
        arr = new int[m];
        for(int i=0;i<m;i++){
            arr[i]= scn.nextInt();
        }
        System.out.println("Sum of array is: " + MathOper.sum(arr));
        System.out.println("The mean of array is: " + MathOper.mean(arr));
        
        int n= scn.nextInt();
        System.out.println("The factorial of n is: "+ MathOper.factorial(n));
    }
}
class MathOper{
    public static int min(int a, int b){
        return (a<b) ? a : b;

    }
    public static int max(int a,int b){
        return(a<b) ? b:a;
    }
    
    public static int sum(int[] args){
        int sum=0;
      
        for(int x :args){
            sum+=x;
        }
        return sum;

    }
    public static float mean(int[] args){
       
        
       float mean= sum(args)/args.length;
       return mean;
    }

    
    public static int factorial(int n){
      
        int result=1;
        if(n<0){
            System.out.println("Please provide positive integer ");
        }
        for(int i=1;i<=n;i++){
            result*=i;

        }
        return result;

    }
}
  
   
/*When a method is declared as static, it can be invoked without creating an instance of the class. 
Static methods cannot access instance-level variables and methods directly */


    
