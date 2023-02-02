import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int sum = 0;
        int prod = 1;
        int avg = 0;
        int cnt = 0;
        while(num>0){
            int digit = num%10;
            sum+= digit;
            prod*= digit;
            cnt++;
            num/=10;
        }

        avg = sum/cnt;
        System.out.println(sum);
        System.out.println(prod);
        System.out.println(avg);
    }
}
