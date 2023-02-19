import java.util.Scanner;

public class GreatSmall {
 
  public static int[] arr = new int[500];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNextInt()) {
            arr[i++] = sc.nextInt();
        }
        System.out.println("The mininum  is: " + minimum(arr));
        System.out.println("The maximum  is: " + maximum(arr));
        if (args.length != 0) {
            System.out.println("The mininum   is: " + minimum(args));
            System.out.println("The maximum  is: " + maximum(args));
        }
        System.out.println("The minimum and maximum are: " + minandmax(arr));
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int x : array) {
            if (x < min) min = x;
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int x : array) {
            if (x > max) max = x;
        }
        return max;
    }

    public static int minimum(String[] array) {
        int min = Integer.parseInt(array[0]);
        for (String x : array) {
            if (Integer.parseInt(x) < min) min = Integer.parseInt(x);
        }
        return min;
    }

    public static int maximum(String[] array) {
        int max = Integer.parseInt(array[0]);
        for (String x : array) {
            if (Integer.parseInt(x) > max) max = Integer.parseInt(x);
        }
        return max;
    }

    public static String minandmax(int[] array) {
        int[] answer = new int[5];
        int min = array[0];
        int max = array[0];
        for (int x : array) {
            if (x < min) min = x;
            if (x > max) max = x;
        }
        return "Min: " + min + ". Max: " + max;
    }
}