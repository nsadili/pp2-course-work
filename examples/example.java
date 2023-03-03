
import java.util.Arrays;

public class example {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int [] arr = new int[10];
        int n =239587436;
        while (n<0){
            arr[n%10] +=1;
            n=n/10;
        }
        
     System.out.println(Arrays.toString(arr));
    }
}

   