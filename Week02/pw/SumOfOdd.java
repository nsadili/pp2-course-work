import java.util.Scanner;
public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write the 1st integer!");
        var a = sc.nextInt();
        System.out.println("Please write the 2nd integer!");
        var b = sc.nextInt();
        var sum=0;

        for (int i=a+1; i<b; i++)
        {
            if (i%2!=0) sum+=i;
        }
        System.out.println(sum);
    }
}