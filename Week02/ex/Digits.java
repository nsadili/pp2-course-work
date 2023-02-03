import java.util.Scanner;
public class Digits {
  
    public static void main(String[] args) {

        
        
        Scanner scan= new Scanner(System.in);
<<<<<<< HEAD
        int n= Math.abs(scan.nextInt());
        int sum=0;
        int digit=0;
        int product=1;
        double avg=0;
        int cnt=0;

        while(n!=0){
=======
        int n= scan.nextInt();
        int sum=0;
        int digit=0;
        int product=1;
        int avg=0;
        int cnt=0;

        while(Math.abs(n)>0){
>>>>>>> 3b8521e49f277a63c2c8c0fa0ddca237872a91e5
        digit= n%10;
        sum=sum+digit;
        product*=digit;




        n= n/10;
        cnt++;
        }
<<<<<<< HEAD
         avg= (sum*1.0)/cnt;
=======
         avg= sum/cnt;
>>>>>>> 3b8521e49f277a63c2c8c0fa0ddca237872a91e5
        System.out.println("Sum is:"+sum);
        System.out.println("Product is :"+product);
        System.out.println("Average is:"+avg);





    }
}
