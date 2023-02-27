import java.util.Scanner;

public class PrintArray{   
    public static void main(String[] args) {
        int[] arr1 = new int[args.length];
        for (int i = 0; i < args.length; i++){
    }
        int max = getMax(arr);
        int min = getMin(arr);
        int[] bothMinMax1 = getMinMax(arr);
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
        System.out.print("Min and Max : ");
            for(int i = 0; i < 2; i++){
            System.out.print(bothMinMax1[i] + " ");
        }         
            Scanner sc = new Scanner(System.in);
            System.out.println("The size of the array:");
            int size = sc.nextInt();
            int[] arr2 = new int[size];
            System.out.println("The elements of the array:");
            for(int i = 0;
            i< size; i++){
                arr2[i] = sc.nextInt();
            } 

            int max1 = getMax(arr1);
            int min1 = getMin(arr1);
            int[] bothMinMax2 = getMinMax(arr1);
            System.out.println("Maximum : " + max1);
            System.out.println("Minimum : " + min1);
             System.out.print("Minimum and Maximum together : ");
              for(int i = 0; i < 2; i++){
                System.out.print(bothMinMax2[i] + " ");
                
            }         

        }
        
        public static int getMin(int[] arr){
            int min = arr[0];

            for (int i = 1; i < arr.length; i++)
            {
                if(arr[i] < min)
                {
                    min = arr[i];
                }
            }
            return min;      
    
        } 

        public static int getMax(int[] arr){
            int max = arr[0];

            for(int i = 1; i < arr.length; i++)
            {
                if(arr[i] > max)
                {
                    max = arr[i];
                }
            }
            return max;
        }

        public static int[] getMinMax(int[] arr) {
            int min = arr[0];
            int max = arr[0];

            for(int i = 1; i < arr.length; i++){
                if(arr[i] < min)
                {
                    min = arr[i];
                }

                if(arr[i] > max)
                {
                    max = arr[i];
                }
            }

            int MinMax[]= new int[2];
            MinMax[0]= min;
            MinMax[1]= max;
            return MinMax;
             
        }
}