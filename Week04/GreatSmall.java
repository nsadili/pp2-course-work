package week04;
import java.util.Scanner;
public class GreatSmall {
    public static void main(String[] args){
        // from command line 
        int[] array = new int[args.length];
        for( int i=0; i< array.length; i++)
        {
            array[i] = Integer.parseInt(args[i]);
        }
        // from scanner 
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers will there be: ");
        int n = sc.nextInt();
        int array2[] = new int[n];
        for(int j=0 ; j<n; j++)
        {
            array2[j] = sc.nextInt();
        }
        System.out.println("Min in array2: "+ min(array2));
        System.out.println("Max in array2: "+ max(array2));
        System.out.println("Min in array: "+ min(array));
        System.out.println("Max in array: "+ max(array));        

         
    }   
    public static int min(int[] array){
        int min = 10000000;
        for (int i=0; i < array.length; i++)
        {
            if (array[i] <=min){
                min = array[i];
            }
        }
        return min;
    } 
    public static int max(int[] array){
        int max = -10000000;
        for (int i=0; i < array.length; i++)
        {
            if (array[i] <= max){
                max = array[i];
            }
        }
        return max;
    } 
}