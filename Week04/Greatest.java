import java.util.Scanner;

public class Greatest {
    static int[] arr = new int[900];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int cnt = scanner.nextInt();

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < cnt; i++) {
           arr[i] = scanner.nextInt();
        }
        
        greatest();
        smallest();
    }

    static void greatest() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }

    static void smallest() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum value: " + min);
    }
}
