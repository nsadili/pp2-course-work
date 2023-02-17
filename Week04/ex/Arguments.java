import java.util.Arrays;
public class Arguments{
    public static void main(String[] args){

        if(args.length ==0){
System.out.print("Please, enter at least a number");
System.exit(1);

        }

        int[] nums=new int [args.length];
        for(int i=0;i<args.length -1;i++){
            nums[i]=Integer.parseInt(args[i]);
            
        }

      printArr(nums);
        sum(nums);
    }
static void printArr(int[] arr){

    for(int el:arr){
        System.out.print(el+" ");
    }
    System.out.println();
}


static int sum(int[] arr){
    for(var el: arr)
    sum+=el;

    return sum;
}
}