import java.util.Scanner;
public class GreatestAndSamallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the size of array:");
        int size = scan.nextInt();
        int [] m = new int[size];
        System.out.println("Enter the array of integers:");
        for(int i = 0; i < size; i++){
            m[i] = scan.nextInt();
        }

        System.out.println("The maximum value in the array is " + Max(m));
        System.out.println("The minimum value is " + Min(m));
        System.out.println(MaxMin(m));


    }


    public static int Min(int [] arr){
        int min = 1000000;
        for(int i : arr){
            if(i < min) min = i;
        }
        return min;
    }

    public static int Max(int[] arr){
        int max = -1000000;
        for(int i : arr){
            if(i > max) max = i;
        }
        return max;
    }

    public static String MaxMin(int[] arr){
        int max = -1000000;
        int min = 10000000;
        for(int i : arr){
            if(i < min) min = i;
            if(i > max) max = i;
        }
        return "The min value is " + min + " and the max is " + max;
    }
}
