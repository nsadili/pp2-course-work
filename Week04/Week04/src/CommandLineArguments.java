import java.util.Scanner;

public class CommandLineArguments {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the size of array:");
        int size = scan.nextInt();
        System.out.println("Enter the array of integer:");
        int[] m = new int[size];
        for(int i = 0; i < size; i++){
            m[i] = scan.nextInt();
        }
        System.out.println("Here is the array that you entered :");
         ShowArray(m);
        int sum = SumOfArray(m);
        System.out.println("The sum of array is " + sum);
        System.out.println("The average is " + (double)sum / size);
    }


    public static int SumOfArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void ShowArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

}
