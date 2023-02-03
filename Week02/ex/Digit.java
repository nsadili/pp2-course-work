// package Week02.ex;
import java.util.Scanner;
public class Digit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numCopy = num;
        var sum = 0;
        var count = 0;
        var product = 1;
        while(num > 0){
            count++;
            int digit = num%10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        var avg = (double) sum / count;
        System.out.printf("Sum = %d, product = %d, average = %2f", sum, product, avg);

    }
}
