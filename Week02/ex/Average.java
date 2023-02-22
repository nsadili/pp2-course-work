package Week02.ex;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var sum = 0;
        var cnt = 0;

        while (scan.hasNextDouble()) {
            sum += scan.nextDouble();
            cnt++;
        }
        
        var avg = (double) sum / cnt;

        System.out.printf("%.3f", avg);
    }
}