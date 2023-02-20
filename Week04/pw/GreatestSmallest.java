import java.util.Scanner;

public class GreatestSmallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Smallest(arr);
        int max = Greatest(arr);

        System.out.println("Smallest number: " + min);
        System.out.println("Greatest number: " + max);

    }


    public static int Smallest(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }


    public static int Greatest(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }


    public static int[] MinMax(int arr[], int a) {
        
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < a; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[] {min, max};
    }

}