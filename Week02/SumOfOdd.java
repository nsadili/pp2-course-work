import java.util.Scanner;
public class SumOfOdd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        var num1 = sc.nextInt();
        var num2 = sc.nextInt();
        var temp  = num2;
        if (num1 > num2){
            num2 = num1;
            num1 = temp;
        }
        int i = 0;
        int sum = 0;
        for (i = num1; i < num2; i++){
            if (i % 2 == 1){
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
