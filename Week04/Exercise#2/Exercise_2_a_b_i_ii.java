import java.util.Scanner;

public class Exercise_2 {
    public static int calculateMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int calculateMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter input:");
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        int[] ints = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            ints[i] = Integer.parseInt(inputs[i]);
        }

        int min = calculateMin(ints);
        int max = calculateMax(ints);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}