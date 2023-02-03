package Easy;
import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int i = 0;
        int sum = 0;
        for (i = num1 + 1; i < num2; i++){
            if(i % 2 == 1){
                sum += i;
            }
        }
        System.out.println(sum);
    }
   
}