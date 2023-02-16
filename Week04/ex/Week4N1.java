import java.util.Arrays;

public class Week4N1 {
    public static void main(String[] args) {

        if (args.length==0){
            System.out.println("Print enter any value!");
            System.exit(1);
        }

        // System.out.println(args); this will not work
        int numbers[]=new int[args.length]; // var numbers=new int[args.length]; also possible

        for (int i=0;i<args.length;i++){
            numbers[i] = Integer.valueOf(args[i]);
        }
        
        printArray(numbers); // if we do not add static to the method, it will not work
        //System.out.println(Arrays.toString(numbers));
        System.out.println("The sum of array: "+sum(numbers));

    }

    private static void printArray(int[] arr){ //we add static for working of printArray
        System.out.print("The Array List: ");
        for (int el: arr){
            System.out.print(el +" ");
        }
        System.out.println();
    }

    private static int sum(int[] arr){
        var sum=0;
        for(var el: arr){
            sum+=el;
        }
        return sum;
    }
}