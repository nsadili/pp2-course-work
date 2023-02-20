package Week04.ex;
import java.util.Scanner;
public class Ex1 {

    public static void printArray(int arr[]) {
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int arraySum(int arr[]) {
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n] ;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }


         printArray(arr);
         System.out.println(arraySum(arr));
    }   
}
