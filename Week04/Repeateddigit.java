import java.util.*;
public class Repeateddigit{
    public static void main(String [] args){
        int [] count = new int[10];
        int n= 15452535;
        while(n>0){
            count[n%10]++;
            n/=10;
        }
        int max = count[0];
        for(int i=0; i<count.length;i++){
            if(max<count[i]){
                max=count[i];
            }

        }
        System.out.println(indexOf(count,max));
    }
   
        public static int indexOf(int arr[], int element){
            for(int i=0;i<arr.length;i++){
                if(arr[i] == element) return i;
            }
            
            return -1;
        }
    }
   // public static int findMostRepeatedDigit(int n)
//	{
//	    int [] arr = new int[10];
//	    while (n > 0)
//	    {
//	        arr[n%10] += 1;
//	        n = n / 10;
//	    }
	    
//	    int max = findMaximum(arr);
//	    return indexOf(arr, max);

//	}
	
//	public static int findMaximum(int [] arr)
//	{
//	    int max = arr[0];
	    
//	    for (int i = 1; i < arr.length; i++)
//	    {
//	        if (max < arr[i])
//	        {
//	            max = arr[i];
//	        }
//	    }
//	    return max;
//	}
	
	
//}/