import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {

        int[] arr;

        if(args.length > 0) {
            arr = new int[args.length];
            for(int i=0; i<args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            arr = new int[n];
            System.out.println("Enter the elements:");
            for(int i=0; i<n; i++) {
                arr[i] = scanner.nextInt();
            }
        }

        int min = getMinimum(arr);
        int max = getMaximum(arr);

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static int getMinimum(int[] arr) {
      int min = arr[0];
      for(int i=1; i<arr.length; i++) {
          if(arr[i] < min) {
              min = arr[i];
          }
      }
      return min;
  }

  public static int getMaximum(int[] arr) {
      int max = arr[0];
      for(int i=1; i<arr.length; i++) {
          if(arr[i] > max) {
              max = arr[i];
          }
      }
      return max;
  }


    }

