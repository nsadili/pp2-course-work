
public class maxmin{

public static int findMaximum(int [] arr)
	{
	    int max = arr[0];
	    
	    for (int i = 1; i < arr.length; i++)
	    {
	        if (max < arr[i])
	        {
	            max = arr[i];
	        }
	    }
	    return max;
	}

	public static int findMinimum(int [] arr)
	{
	    int min = arr[0];
	    
	    for (int i = 1; i < arr.length; i++)
	    {
	        if (min > arr[i])
	        {
	            min = arr[i];
	        }
	    }
	    return min;
	}
	public static void main(String[] args) {
		int [] newArray = {3, 4, 2, 1, 11, 2, 5, 9};
		int a= findMinimum(newArray);
        System.out.println(a);
	}

}