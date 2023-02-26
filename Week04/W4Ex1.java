public class W4Ex1 {

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int sum(int[] arr){
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            res += arr[i];
        }
        return res;
    }

    public static void main(String[] args){
        int n = args.length; // size of arrays
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(args[i]);
        }
        printArray(arr);
        System.out.println(sum(arr));

    }
}
