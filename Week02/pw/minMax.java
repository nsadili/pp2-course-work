import java.util.Scanner;
//press ctrl+D to trigger EOF
public class minMax {
    public static void main(String[] args){
        var obj = new Scanner(System.in);
        float[] nums= new float[100];
        int i=0;
        while(obj.hasNextFloat()) {
            nums[i] = obj.nextFloat();
            i++;
        }

        float min = Float.MAX_VALUE;
        float max = -Float.MAX_VALUE;

        for(i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];}
            if(nums[i] < min){
                min = nums[i];}
        }
        System.out.printf("max is: %f\nmin is:%f",max,min);
    }
}
