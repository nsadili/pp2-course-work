import java.util.Scanner;

public class Digits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        if(n < 0) n *= -1;
        int sum = 0;
        int product = 1;
        int c = 0;
        while(n != 0){
            sum += n % 10;
            product *= n % 10;
            c++;
            n /= 10;
        }
        System.out.printf("sum: %d\nproduct: %d\naverage: %d\n", sum, product, sum / c);
    }
}
