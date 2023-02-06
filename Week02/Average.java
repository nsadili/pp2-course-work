package taghi_mammadov.week_02;
import java.util.*;
public class Average {
    public static void main(String[] args){
        
        try (Scanner in = new Scanner(System.in)) {
        
            System.out.print("Input number(s): ");
              int n = in.nextInt();

              if (n < 1){
                System.out.println("error");
                System.exit(1);
            }

        int[] nums = {n};
         
        float sum = 0;
         
        int i=0;
        while(i < nums.length) {
            sum += nums[i];
            i++;
        }
         
        float average = (sum / nums.length); 
         
        System.out.println("Average : "+average);

    }
}
}
