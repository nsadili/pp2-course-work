import java.util.Scanner;

public class ArmstrongNumbersPartB {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        
        for (int i = num1; i <= num2; i++) {
            int cnt = 0;
            int digit = 0;
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                temp /= 10;
                cnt++;
            }
            temp = i;
            while (temp > 0) {
                digit = temp % 10;
                sum += Math.pow(digit, cnt);
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(i + " is an Armstrong number");
            }
        }
    }
}
