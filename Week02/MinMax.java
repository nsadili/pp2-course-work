package Week02;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add the numbers: ");
        float num;
        int a = 0;
        float max = -99999;
        float min = 99999;
        do {
            num = sc.nextFloat();
            max = Math.max(max, num);
            min = Math.min(min, num);
//            if (num < min) min = num;
//            if (num > max) max = num;
        } while (sc.hasNextFloat());
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }
}