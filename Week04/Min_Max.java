import java.util.Arrays;
import java.util.Scanner;

public class Min_Max{
    public static void main(String[] args){ 
        int min = 1000;
        int max = -1000;
        int numbers[] = {1, 2, 17, -21, 31, 112, -43, -31, -99};

        for (int i = 0; i < 9; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum of this array is: " + min);
        System.out.println("Maximum of this array is: " + max);
    }
}   