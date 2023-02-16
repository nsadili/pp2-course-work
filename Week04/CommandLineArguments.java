import java.util.Arrays;
public class CommandLineArguments {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Pleasem enter at least an integer");
            System.exit(1);

        }
    
    int numbers[] = new int[args.length];
    for (int i = 0; i < args.length; i++){
        numbers[i] = Integer.parseInt(args[i]);
    }
    printArray(numbers);
    System.out.println(sumArr(numbers));
    System.out.println(avgArr(numbers));
}


private static void printArray(int[] arr){
    for (var el : arr){
        System.out.print(el + " ");
    }
    System.out.println();
}
private static int sumArr(int[] arr){
    var sum = 0;
    var count = 0;
    for (var el : arr)
        sum += el;
    return sum;
}
private static int avgArr(int[] arr){
    return sumArr(arr) / arr.length;

}
}