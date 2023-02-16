import java.util.Arrays;

public class EX1{
     public static void main(String[] args){
        if (args.length == 0)
        {
        System.out.println("Please, enter a value.");
        System.exit(1);
        }
        
    System.out.println(Arrays.toString(args));
        var numbers = new int[args.length];
        for(int i=0;i<args.length;i++){

        numbers[i]=Integer.parseInt(args[i]);
        }
        printArray(numbers);
        System.out.printf("SUM: %d",sum(numbers));
    }

     private static void printArray(int[] arr) {
         for (int a : arr){
            System.out.print(a + ", ");
         }
         System.out.println();
        }

     
private static int sum(int[] arr){
    int sum=0;
    for(int a : arr){
        sum+=a;
    }
return sum;
}
    
}

    