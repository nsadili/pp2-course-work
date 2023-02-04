package week2_assignments;
import java.util.Scanner;


public class SumOfOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		int m = input.nextInt();
        int n = input.nextInt();
        input.close();
        int sum = 0;
        
        if(m > n){
            for(int i = n; i < m; i++)
            {
               if(i % 2 != 0) sum += i;
            }
        }
        else if(n > m){
            for(int i = m; i < n; i++)
            {
               if(i % 2 != 0) sum += i;
            }
        }
		System.out.println(sum);
    }
}
