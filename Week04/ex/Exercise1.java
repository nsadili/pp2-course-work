import java.util.*;

public class Exercise1{
    public static void main(String [] args){
        if(args.length==0){
            System.out.println("Please, enter an integer");
            System.exit(1);
        }
        Scanner scan= new Scanner(System.in);  
        int numbers[];
        for(int i=0; i< args.length; i++){
            numbers[i]=Integer.parseInt(args[i]);
        }
        System.out.println(Arrays.toString(args));
        System.out.println(Arrays.toString(numbers));
    }
    void printArr(int[] arr){
        for(int el : arr) {
            System.out.print(el + " "); 
        }

    System.out.println();
    
    }
     private static int sumArr(int [] arr){
        int sum=0;
        for(int  el: arr)
        sum += el;
        return sum;
     }
}