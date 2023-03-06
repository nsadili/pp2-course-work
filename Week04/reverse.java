
import java.util.Arrays;

public class reverse {
    public static void main(String[] args){
    int [] newArray = {3, 4, 2, 1, 11, 2, 5, 9};
    int start = 0;
    int end = newArray.length - 1;
    while (start < end) {
        int temp = newArray[start];
        newArray[start] = newArray[end];
        newArray[end] = temp;
        start++;
        end--;
    }
    System.out.println(Arrays.toString(newArray));
	    
}
}
