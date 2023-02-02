import java.util.*;
public class SumOfOdd {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum =0;
        if(b>a){
        for(int i=a; i<=b; i++)if (i%2!=0) sum +=i;
        System.out.println(sum);
        }
        else {
            for(int i=b; i<=a; i++)if (i%2!=0) sum +=i;
            System.out.println(sum);
            }
    }
}
