import java.util.Scanner;

//package Week04.pw;

public class PW2 {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Enter a valid number!");
            System.exit(1);
        }

        System.out.println("Minimum value: " + min(args));
        System.out.println("Maximum value: " + max(args));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the count of numbers: ");
        int[] nums = new int[scanner.nextInt()];
        System.out.print("Enter numbers (using scanner): ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Min value: " + minUsingScanner(nums));
        System.out.println("Max value: " + maxUsingScanner(nums));

    }

    static int min(String[] args) {
        int min = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            int val = Integer.parseInt(args[i]);
            if (val < min) min = val;
        }
        return min;
    }

    static int minUsingScanner(int[] args) {
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) min = args[i];
        }
        return min;
    }

    static int max(String[] args) {
        int max = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            int val = Integer.parseInt(args[i]);
            if (val > max) max = val;
        }
        return max;
    }

    static int maxUsingScanner(int[] args) {
        int max = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] > max) max = args[i];
        }
        return max;
    }
}
