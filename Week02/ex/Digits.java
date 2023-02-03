import java.util.Scanner;
public class Digits {
  
    public static void main(String[] args) {

        
        
        Scanner scan= new Scanner(System.in);
        int n= Math.abs(scan.nextInt());
        int sum=0;
        int digit=0;
        int product=1;
        double avg=0;
        int cnt=0;

        while(n!=0){
        digit= n%10;
        sum=sum+digit;
        product*=digit;




        n= n/10;
        cnt++;
        }
         avg= (sum*1.0)/cnt;
        System.out.println("Sum is:"+sum);
        System.out.println("Product is :"+product);
        System.out.println("Average is:"+avg);





    }
}
