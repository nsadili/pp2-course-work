import java.util.Arrays;
import java.util.Scanner;
public class GreatestSmallest2 {
    /*Do the same for an array entered by using a Scanner object.
c. Can you define another method that can calculate and return both at the same time?
*/

    public static void main(String[] args){
       
        Scanner scan= new Scanner(System.in);
        int size = scan.nextInt();
        int numbers []= new int[size];

        for(int i=0;i<size;i++){
            numbers[i]= scan.nextInt();

         
        }
        
        System.out.println("Minimum is: "+PrintMin(numbers));
        System.out.println("Maximum is: "+PrintMax(numbers));
       
        System.out.println("Minimum and Maximum in one array " +Arrays.toString(minMax(numbers)));

        

    }
    private static int[] minMax(int[] arr){
        int min2= Integer.MAX_VALUE;
        int max2= Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min2){
                min2=arr[i];

            } else if(arr[i]>max2){
                max2=arr[i];
            }

        }
        return new int[] {min2,max2};
    }
    private static int PrintMin(int[] arr){
        int min= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    private static int PrintMax(int[] arr){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    

}
