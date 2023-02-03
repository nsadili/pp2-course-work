import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in); 
        System.out.println("Enter two numbers");
        var a = input.nextInt();
        var b = input.nextInt();
        var cnt=0;
        if(a>b) {
            System.out.println("The second number is less than first");
            System.exit(1);
        }
        if(a<b) {
           while(a<b) {
            a++;
            if(a%2==1) cnt+=a; 
           }
        }
        System.out.println("The sum is: " +cnt);
    }
}
