
import java.util.*;
public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int i,sum=0,temp;

        if (n1 > n2) {

            temp = n1;

            n1 = n2;

            n2 = temp; }

        for (i = n1; i < n2; i++) {

            if (i%2!=0 && i!=n1)  {

                sum+=i;

                i++;} }

        System.out.print(sum);}}
