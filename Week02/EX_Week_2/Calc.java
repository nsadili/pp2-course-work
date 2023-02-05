import java.util.Scanner;

public class Calc{
    public static void main(String[] args) throws Exception {
      Scanner myObj = new Scanner(System.in); 
      int a = myObj.nextInt(); 
      int b = myObj.nextInt();

      int sum= a+b;
      int subt= a-b;
      int mult= a*b;
      int div= a/b;
      int rem= a%b;

      System.out.println(sum);
      System.out.println(subt);
      System.out.println(mult);
      System.out.println(div);
      System.out.println(rem);
   

    
    }
}
/*Scanner myObj = new Scanner(System.in);  
      int a = myObj.nextInt();  
      int b = myObj.nextInt();
 */