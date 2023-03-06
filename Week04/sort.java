
import java.util.Arrays;

public class sort {
    public static void main(String[] args){
        int [] newArray = {3, 4, 2, 1, 11, 2, 5, 9};
	    
	    for (int i = 0; i < newArray.length; i++)
	    {
	        for(int j = i+1; j < newArray.length; j++)
	        {
	            if (newArray[i] > newArray[j])
	            {
	                int temp = newArray[i];
	                newArray[i] = newArray[j];
	                newArray[j] = temp;
	            }
	        }
	    }
	  System.out.println(Arrays.toString(newArray));
    }
}
