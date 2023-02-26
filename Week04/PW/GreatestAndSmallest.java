import java.util.Scanner;


public class GreatestAndSmallest {
    public static int min(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Cannot find minimum of an empty array.");
        }
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < result) {
                result = numbers[i];
            }
        }
        return result;
    }

    public static int max(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Cannot find maximum of an empty array.");
        }
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        return result;
    }

    public static int[] minAndMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Cannot find minimum and maximum of an empty array.");
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return new int[] {min, max};
    }

    public static void main(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        int max = max(numbers);
        int min = min(numbers);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers2[i] = scanner.nextInt();
        }
        int max2 = max(numbers2);
        int min2 = min(numbers2);
        System.out.println("Maximum: " + max2);
        System.out.println("Minimum: " + min2);

        int[] numbers3 = {5, 10, -3, 8, 15};
        int[] minAndMax = minAndMax(numbers3);
        int min3 = minAndMax[0];
        int max3 = minAndMax[1];
        System.out.println("Minimum: " + min3);
        System.out.println("Maximum: " + max3);
    }
}
