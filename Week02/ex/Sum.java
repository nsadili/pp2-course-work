import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    System.out.print("print 1th number ");
    int a= scan.nextInt();   
    System.out.print("print 2th number ");
    var b= scan.nextInt(); 
    var sum = a+b;
   
    System.out.printf("%d + %d = %d\n",a,b,sum);  



    }
}