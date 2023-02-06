import java.util.Scanner;

public class DiceMan {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        //int n= scan.nextInt();
        double a;
        int num;
        int time=10,res=0;
        while (true) {
            System.out.print("Enter a value for n (or 0 to exit): ");
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
        if ((n%10)>6 || (n/10)>6 || (n%10)==0 || n<11 )
        {
        System.out.println("ERROR");
        System.exit(n);
        }
        while(time>-8)
        {
        a=Math.random();
        if(a<0.16666666666)
        num=1; else
        if(a<0.33333333333)
        num=2; else
        if(a<0.5)
        num=3;else 
        if(a < 0.66666666666)
        num=4; else 
        if(a<(5/6))
        num=5;else
        num=6;
        res+=num*time;
        time-=9;
        
        
        }
        System.out.printf("INPUT: %d \nNUMBER: %d \n",n,res);

if(res==n) System.out.println("WINNER IS PLAYER!");

else System.out.println("WINNER IS COMPUTER!");


        
    }
}
}
