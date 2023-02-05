import java.util.Scanner;
import java.lang.Math;
public class Digits {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner=new Scanner(System.in);
        
        int a= scanner.nextInt();
        int x=0;
        int f=0;
        int res;
        double sum=0.0;
        int product=1;
        

        while(a>0){
            res=a%10;
            sum=sum+res;
            product=product*res;

            a=a/10;
            f+=1;
        }
        System.out.printf("Sum of the digits: "+"%.0f",+sum);
        System.out.print("\n");
        System.out.println("Product of the digits: "+product);
        System.out.printf("Average of the digits: "+"%.2f",sum/f);
    }

}
