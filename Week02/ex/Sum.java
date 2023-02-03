import java.util.Scanner;

public class Sum {
  
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in); 
        
         System.out.print("num1 > ");        
         int a = input.nextInt();
        System.out.print("num2 > ");
         var b = input.nextInt();
    
        var sum= a+b;

        System.out.printf("%d+%d=%d", a,b,sum);
    
     }
        
    }

