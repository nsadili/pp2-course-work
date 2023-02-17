import java.util.Scanner;

public class GreatestAndSmallest{
    public static void main(String[] args){
        // Scanner sc= new Scanner(System.in);
        // String[] nums = {};
        // while(sc.hasNext()){
        //     String x = sc.next();
        //     String[] tmp = new String[nums.length];
        //     for(int a=0;a<nums.length;a++){
        //         tmp[a]=nums[a];
        //     }
        //     nums = new String[nums.length+1];
        //     for(int a=0;a<tmp.length;a++){
        //         nums[a]=tmp[a];
        //     }
        //     nums[nums.length-1] = x;
        // }

        // nums for scaner args for arguments
        System.out.println("Min: "+min(args));
        System.out.println("Max: "+max(args));
        System.out.printf("Min and Max: %d %d",minAndMax(args)[0], minAndMax(args)[1]);
    }

    static int min(String[] nums){
        int min = Integer.MAX_VALUE;
        for(String x: nums){
            if(Integer.parseInt(x) <min){min=Integer.parseInt(x);}
        }
        return min;
    }

    static int max(String[] nums){
        int max = Integer.MIN_VALUE;
        for(String x: nums){
            if(Integer.parseInt(x)>max){max=Integer.parseInt(x);}
        }
        return max;
    }

    static int[] minAndMax(String[] nums){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(String x: nums){
            if(Integer.parseInt(x)<min){min=Integer.parseInt(x);}
            if(Integer.parseInt(x)>max){max=Integer.parseInt(x);}
        }

        int [] minAndMax = {min,max};
        return minAndMax;
    }
}