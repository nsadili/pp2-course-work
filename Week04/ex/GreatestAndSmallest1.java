import java.util.*;
public class GreatestAndSmallest1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();

        if (size == 0) {
            System.out.println("Size must be positive!");
            System.exit(0);
        }

        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        sc.close();
    }
    
}
