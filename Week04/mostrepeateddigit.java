

public class mostrepeateddigit {
    public static int findMostRepeatedDigit(int n)
	{
	    int [] arr = new int[10];
	    while (n > 0)
	    {
	        arr[n%10] += 1;
	        n = n / 10;
	    }
	    
	    int max =findMaximum(arr);
	    return indexOf(arr, max);

	}

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
	public static int indexOf (int [] arr, int element)
	{
	    int index = -1;
	    for(int i = 0; i < arr.length; i++)
	    {
	        if (arr[i] == element)
	        {
	           index = i;
	        }
	    }
	    return  index;
	}
	
}

