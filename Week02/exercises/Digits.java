import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var n = sc.nextInt();
        if (n==0) System.out.printf("Sum is 0, Product is 0, and Average is 0.");
        if (n<0) n=n*(-1); //n=Math.abs(n);
        if (n>0)
        {
        var a=0;
        var sum=0;
        var pro=1;
        var cnt=0;

        while (n>0)
        {
            a=n%10;
            sum+=a;
            pro*=a;
            cnt++;
            n/=10;
        }
        var ave=(float) sum/cnt;
        System.out.printf("Sum is %d, Product is %d, and Average is %f.", sum, pro, ave);
    }
    }
}