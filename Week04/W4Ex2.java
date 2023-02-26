import java.util.Scanner;

public class W4Ex2 {
    
    public static void MinMax(int[] arr, int size){
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < size; i++) {
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("The minimum value is: " + min + ".The maximum value is: " + max);
    } 

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the size of the array: ");
        int size = sc.nextInt();

        System.out.println();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i+1) + "th value");
            arr[i] = sc.nextInt();
        }
        sc.close();

        MinMax(arr, size);

        }
}


