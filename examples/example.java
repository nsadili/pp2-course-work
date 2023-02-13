import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a;
        int b;        
        int min = 10000;
        int max = -10000;
        int sum = 0;
        int i = 0;
        for(i= 0 ; i <= n; i++){
            if(a<min)
            min = a;

        }
        for(i= 0 ; i <= n; i++){
            if(b > max)
            max = b;
        }
        {
            sum= min + max;
        }
        System.out.println(+ sum);
    }
}