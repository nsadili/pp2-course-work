import java.util.Scanner;
public class Digits {
  
    public static void main(String[] args) {

        
        
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        int sum=0;
        int digit=0;
        int product=1;
        int avg=0;
        int cnt=0;

        while(Math.abs(n)>0){
        digit= n%10;
        sum=sum+digit;
        product*=digit;




        n= n/10;
        cnt++;
        }
         avg= sum/cnt;
        System.out.println("Sum is:"+sum);
        System.out.println("Product is :"+product);
        System.out.println("Average is:"+avg);





    }
}
