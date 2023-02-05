import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var a = sc.nextInt();
        var b = sc.nextInt();
        var sum=0;
        var i=0;
        var j=0;
        var n=0;

        for (i=a; i<b;i++)
        {
            j=i;
            while (j>0)
            {
                n=j%10;
                sum+=Math.pow(n,3);
                j/=10;
            }
            if (sum==i) System.out.println(i);
        }
        
    }
}
