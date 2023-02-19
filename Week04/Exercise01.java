
public class Exercise01 {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Enter something!!");
            System.exit(1);
        }
        int numbs[] = new int [args.length]; 
        for(int i = 0; i < args.length; i++){
            numbs[i] = Integer.parseInt(args[i]);
        }
        //System.out.println(Arrays.toString(args));
       // System.out.println(Arrays.toString(numbs));
        printArr(numbs);
        sumOfArray(numbs);

    }

    static void printArr(int[] arr){
        for(int el: arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }

    static int sumOfArray(int[] arr){
        var sum = 0;
        for(var el: arr)
        sum += el;

        return sum;
    }
}
