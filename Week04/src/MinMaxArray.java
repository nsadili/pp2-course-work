import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
        
    }
}
