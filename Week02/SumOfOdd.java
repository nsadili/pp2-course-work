package Week02;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int  sum = 0;
        for(int i = a; i <= b; i++ ){
            if(i % 2 != 0){
                sum = sum +i;
            }
           
        }
        System.out.println(sum);
    }
    
}
}
