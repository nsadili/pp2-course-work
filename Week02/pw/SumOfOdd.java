import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();

        int sum = 0;

        int start, end;

        if(num1 <= num2){
            start = num1;
            end = num2;
        }else{
            start = num2;
            end = num1;
        }

        for(int i = start; i <= end; i++){
            if(i % 2 != 0)
            sum +=i;
        }

        System.out.println("Sum of odd numbers is: " + sum);
    }
    
}
