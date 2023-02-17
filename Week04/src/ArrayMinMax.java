import java.util.Scanner;

public class ArrayMinMax {

    public static void minMax(int arr[]) {
        int min = 1000000;
        int max = -1000000;
        for(int i: arr) {
            if(i>max) {
                max = i;
                continue;
            }
            if(i<min) {
                min = i;
                continue;
            }
            
        }
        System.out.println("Max: "+max+", Min: "+min);
    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n] ;

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }


        minMax(arr);
    }
}
