import java.util.Scanner;

public class ArmstrongNumbersPartA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int cnt = 0;
        int digit = 0;
        int sum = 0;
        int temp = num;

        while(temp > 0){
            temp /= 10;
            cnt++;
        }
        temp = num;
        while(temp > 0){
            digit = temp % 10;
            sum += Math.pow(digit, cnt);
            temp /= 10;
        }
        
        if(sum == num){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
