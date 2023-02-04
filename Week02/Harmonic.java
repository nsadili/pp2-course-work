package week2_assignments;
import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        double sum = 0;
        // the n-th harmonic number is the sum of the reciprocals of the first n natural numbers
        for(int i = 1; i <= n; i ++)
        {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
