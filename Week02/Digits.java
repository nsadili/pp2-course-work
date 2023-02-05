import java.util.Scanner;
public class Digits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        var n= sc.nextInt();
        sc.close();
        int sum=0;
        int product=1;
        int copy=n;
        int cnt=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            product*=digit;
            cnt++;
            n /= 10;
        }
        System.out.println("The sum of the digits of" + copy + "is" + sum);
        System.out.println("The product of the digits of" + copy + "is" + product);
        System.out.println("The average of the digits of" + copy + "is" + (float)sum/cnt);

    }
}
