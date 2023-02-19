
import java.util.Arrays;
import java.util.Scanner;
public class CommandLineArguments {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int i;
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
    }
    print(arr);
    System.out.println();
    System.out.println(sum(arr));
        
}
public static void print(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
        if(i==arr.length-1)break;
        System.out.print(",");
    }
}
public static int sum(int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    return sum;

}

}



