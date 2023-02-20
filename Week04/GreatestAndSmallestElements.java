package Week04;
import java.util.Arrays;
import java.util.Scanner;
public class GreatestAndSmallestElements {


    public static void maxMinTogether(String [] args, int [] arr){
            int maxm = -1000001;
            int minm = 1000001;
    
            for(int i = 0; i < args.length; i++){
                if(Integer.parseInt(args[i]) > maxm) {
                    maxm = Integer.parseInt(args[i]); 
                }
            }
    
            for (int i = 0; i < args.length; i++) {
                if(Integer.parseInt(args[i]) < minm){
                    minm = Integer.parseInt(args[i]);
                }
            }
    
            System.out.println("Maximum of the given command line array is: " + maxm 
            + " \nMinimum of the given command line array is: " + minm);
    
            int maxm2 = -1000001;
            int minm2 = 1000001;
    
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > maxm2) {
                    maxm2 = (arr[i]); 
                }
            }
    
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] < minm2){
                    minm2 = (arr[i]);
                }
            }

            System.out.println("Maximum of the given Scanner array is: " + maxm2
             + " \nMinimum of the given Scanner array is: " + minm2);
    }


    public static void main(String[] args) {
        
        System.out.println("Input array: " + Arrays.toString(args));
        //maxAndMinOfArray(args);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");

        int n = scanner.nextInt();

        int arr[] = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        //maxAndMinScannerArray(arr);

        maxMinTogether(args, arr);
        scanner.close();
    }
}
