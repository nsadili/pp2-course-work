import java.util.Scanner;
public class ArrayMinMax{   
    
     public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();
            int[] arr2 = new int[size];
            System.out.println("Enter the elements of the array:");
            for(int i = 0; i< size; i++)
            {
                arr2[i] = sc.nextInt();
            } 

            int max2 = getMax(arr2);
            int min2 = getMin(arr2);
            int[] bothMinMax2 = getMinMax(arr2);
            System.out.println("Maximum : " + max2);
            System.out.println("Minimum : " + min2);
             System.out.print("Minimum and Maximum together : ");
              for(int i = 0; i < 2; i++)
            {
                System.out.print(bothMinMax2[i] + " ");
                
            }         
                
            }                 
            public static int getMax(int[] arr)
            {
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
    public static int getMin(int[] arr)
    {
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

    public static int[] getMinMax(int[] arr)
    {
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }

            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return arr;

    }
}